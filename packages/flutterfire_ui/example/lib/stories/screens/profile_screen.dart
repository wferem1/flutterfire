import 'package:flutterfire_ui/auth.dart';
import 'package:flutterfire_ui_example/config.dart';
import 'package:flutterfire_ui_example/stories/stories_lib/story.dart';
import 'package:flutter/widgets.dart';
import 'package:flutterfire_ui_oauth_apple/flutterfire_ui_oauth_apple.dart';
import 'package:flutterfire_ui_oauth_facebook/flutterfire_ui_oauth_facebook.dart';
import 'package:flutterfire_ui_oauth_google/flutterfire_ui_google_oauth.dart';
import 'package:flutterfire_ui_oauth_twitter/flutterfire_ui_oauth_twitter.dart';

class ProfileScreenStory extends StoryWidget {
  const ProfileScreenStory({Key? key})
      : super(key: key, category: 'Screens', title: 'ProfileScreen');

  @override
  Widget build(StoryElement context) {
    final emailEnabled =
        context.knob<bool>(title: 'Email provider', value: true);
    final phoneEnabled =
        context.knob<bool>(title: 'Phone provider', value: true);
    final googleEnabled =
        context.knob<bool>(title: 'Google OAuth', value: true);
    final appleEnabled = context.knob<bool>(title: 'Apple OAuth', value: true);
    final facebookEnabled = context.knob<bool>(
      title: 'Facebook OAuth',
      value: true,
    );
    final twitterEnabled = context.knob<bool>(
      title: 'Twitter OAuth',
      value: true,
    );

    return StreamBuilder(
      builder: (context, snapshot) {
        if (snapshot.hasData) {
          return ProfileScreen(
            providers: [
              if (emailEnabled) EmailAuthProvider(),
              if (phoneEnabled) PhoneAuthProvider(),
              if (googleEnabled)
                GoogleProvider(
                  clientId: GOOGLE_CLIENT_ID,
                ),
              if (appleEnabled) AppleProvider(),
              if (facebookEnabled)
                FacebookProvider(
                  clientId: FACEBOOK_CLIENT_ID,
                ),
              if (twitterEnabled)
                TwitterProvider(
                  apiKey: TWITTER_API_KEY,
                  apiSecretKey: TWITTER_API_SECRET_KEY,
                  redirectUri: TWITTER_REDIRECT_URI,
                )
            ],
          );
        } else {
          return const Center(child: Text('Not authroized'));
        }
      },
    );
  }
}
