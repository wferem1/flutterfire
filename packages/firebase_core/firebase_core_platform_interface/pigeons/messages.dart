import 'package:pigeon/pigeon.dart';

@ConfigurePigeon(
  PigeonOptions(
    dartOut: 'lib/src/messages.pigeon.dart',
    javaOut:
        '../firebase_core/android/src/main/java/io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore.java',
    javaOptions: JavaOptions(
      package: 'io.flutter.plugins.firebase.core',
      className: 'GeneratedAndroidFirebaseCore',
    ),
  ),
)
class PigeonFirebaseOptions {
  PigeonFirebaseOptions({
    required this.authDomain,
    required this.measurementId,
    required this.deepLinkURLScheme,
    required this.androidClientId,
    required this.iosClientId,
    required this.iosBundleId,
    required this.appGroupId,
    required this.apiKey,
    required this.appId,
    required this.messagingSenderId,
    required this.projectId,
    required this.databaseURL,
    required this.storageBucket,
    required this.trackingId,
  });

  final String apiKey;

  final String appId;

  final String messagingSenderId;

  final String projectId;

  final String? authDomain;

  final String? databaseURL;

  final String? storageBucket;

  final String? measurementId;

  final String? trackingId;

  final String? deepLinkURLScheme;

  final String? androidClientId;

  final String? iosClientId;

  final String? iosBundleId;

  final String? appGroupId;
}

class PigeonInitializeReponse {
  PigeonInitializeReponse({
    required this.name,
    required this.options,
    required this.isAutomaticDataCollectionEnabled,
    required this.pluginConstants,
  });

  String name;
  PigeonFirebaseOptions options;
  bool? isAutomaticDataCollectionEnabled;
  Map<String?, Object?> pluginConstants;
}

@HostApi()
abstract class FirebaseCoreHostApi {
  @async
  PigeonInitializeReponse initializeApp(
    String appName,
    PigeonFirebaseOptions initializeAppRequest,
  );

  @async
  List<PigeonInitializeReponse> initializeCore();

  @async
  PigeonFirebaseOptions optionsFromResource();
}

@HostApi()
abstract class FirebaseAppHostApi {
  @async
  void setAutomaticDataCollectionEnabled(
    String appName,
    bool enabled,
  );

  @async
  void setAutomaticResourceManagementEnabled(
    String appName,
    bool enabled,
  );

  @async
  void delete(
    String appName,
  );
}