// Autogenerated from Pigeon (v3.1.5), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package io.flutter.plugins.firebase.core;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class GeneratedAndroidFirebaseCore {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class PigeonInitializeAppRequest {
    private @NonNull String apiKey;
    public @NonNull String getApiKey() { return apiKey; }
    public void setApiKey(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
      }
      this.apiKey = setterArg;
    }

    private @Nullable String appName;
    public @Nullable String getAppName() { return appName; }
    public void setAppName(@Nullable String setterArg) {
      this.appName = setterArg;
    }

    private @NonNull String appId;
    public @NonNull String getAppId() { return appId; }
    public void setAppId(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"appId\" is null.");
      }
      this.appId = setterArg;
    }

    private @NonNull String messagingSenderId;
    public @NonNull String getMessagingSenderId() { return messagingSenderId; }
    public void setMessagingSenderId(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
      }
      this.messagingSenderId = setterArg;
    }

    private @NonNull String projectId;
    public @NonNull String getProjectId() { return projectId; }
    public void setProjectId(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"projectId\" is null.");
      }
      this.projectId = setterArg;
    }

    private @Nullable String databaseURL;
    public @Nullable String getDatabaseURL() { return databaseURL; }
    public void setDatabaseURL(@Nullable String setterArg) {
      this.databaseURL = setterArg;
    }

    private @Nullable String storageBucket;
    public @Nullable String getStorageBucket() { return storageBucket; }
    public void setStorageBucket(@Nullable String setterArg) {
      this.storageBucket = setterArg;
    }

    private @Nullable String trackingId;
    public @Nullable String getTrackingId() { return trackingId; }
    public void setTrackingId(@Nullable String setterArg) {
      this.trackingId = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private PigeonInitializeAppRequest() {}
    public static final class Builder {
      private @Nullable String apiKey;
      public @NonNull Builder setApiKey(@NonNull String setterArg) {
        this.apiKey = setterArg;
        return this;
      }
      private @Nullable String appName;
      public @NonNull Builder setAppName(@Nullable String setterArg) {
        this.appName = setterArg;
        return this;
      }
      private @Nullable String appId;
      public @NonNull Builder setAppId(@NonNull String setterArg) {
        this.appId = setterArg;
        return this;
      }
      private @Nullable String messagingSenderId;
      public @NonNull Builder setMessagingSenderId(@NonNull String setterArg) {
        this.messagingSenderId = setterArg;
        return this;
      }
      private @Nullable String projectId;
      public @NonNull Builder setProjectId(@NonNull String setterArg) {
        this.projectId = setterArg;
        return this;
      }
      private @Nullable String databaseURL;
      public @NonNull Builder setDatabaseURL(@Nullable String setterArg) {
        this.databaseURL = setterArg;
        return this;
      }
      private @Nullable String storageBucket;
      public @NonNull Builder setStorageBucket(@Nullable String setterArg) {
        this.storageBucket = setterArg;
        return this;
      }
      private @Nullable String trackingId;
      public @NonNull Builder setTrackingId(@Nullable String setterArg) {
        this.trackingId = setterArg;
        return this;
      }
      public @NonNull PigeonInitializeAppRequest build() {
        PigeonInitializeAppRequest pigeonReturn = new PigeonInitializeAppRequest();
        pigeonReturn.setApiKey(apiKey);
        pigeonReturn.setAppName(appName);
        pigeonReturn.setAppId(appId);
        pigeonReturn.setMessagingSenderId(messagingSenderId);
        pigeonReturn.setProjectId(projectId);
        pigeonReturn.setDatabaseURL(databaseURL);
        pigeonReturn.setStorageBucket(storageBucket);
        pigeonReturn.setTrackingId(trackingId);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("apiKey", apiKey);
      toMapResult.put("appName", appName);
      toMapResult.put("appId", appId);
      toMapResult.put("messagingSenderId", messagingSenderId);
      toMapResult.put("projectId", projectId);
      toMapResult.put("databaseURL", databaseURL);
      toMapResult.put("storageBucket", storageBucket);
      toMapResult.put("trackingId", trackingId);
      return toMapResult;
    }
    static @NonNull PigeonInitializeAppRequest fromMap(@NonNull Map<String, Object> map) {
      PigeonInitializeAppRequest pigeonResult = new PigeonInitializeAppRequest();
      Object apiKey = map.get("apiKey");
      pigeonResult.setApiKey((String)apiKey);
      Object appName = map.get("appName");
      pigeonResult.setAppName((String)appName);
      Object appId = map.get("appId");
      pigeonResult.setAppId((String)appId);
      Object messagingSenderId = map.get("messagingSenderId");
      pigeonResult.setMessagingSenderId((String)messagingSenderId);
      Object projectId = map.get("projectId");
      pigeonResult.setProjectId((String)projectId);
      Object databaseURL = map.get("databaseURL");
      pigeonResult.setDatabaseURL((String)databaseURL);
      Object storageBucket = map.get("storageBucket");
      pigeonResult.setStorageBucket((String)storageBucket);
      Object trackingId = map.get("trackingId");
      pigeonResult.setTrackingId((String)trackingId);
      return pigeonResult;
    }
  }

  public interface Result<T> {
    void success(T result);
    void error(Throwable error);
  }
  private static class FirebaseCoreHostApiCodec extends StandardMessageCodec {
    public static final FirebaseCoreHostApiCodec INSTANCE = new FirebaseCoreHostApiCodec();
    private FirebaseCoreHostApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return PigeonInitializeAppRequest.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof PigeonInitializeAppRequest) {
        stream.write(128);
        writeValue(stream, ((PigeonInitializeAppRequest) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface FirebaseCoreHostApi {
    void intializeApp(@Nullable PigeonInitializeAppRequest initializeAppRequest, Result<Map<String, Object>> result);

    /** The codec used by FirebaseCoreHostApi. */
    static MessageCodec<Object> getCodec() {
      return FirebaseCoreHostApiCodec.INSTANCE;
    }

    /** Sets up an instance of `FirebaseCoreHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, FirebaseCoreHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FirebaseCoreHostApi.intializeApp", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              PigeonInitializeAppRequest initializeAppRequestArg = (PigeonInitializeAppRequest)args.get(0);
              Result<Map<String, Object>> resultCallback = new Result<Map<String, Object>>() {
                public void success(Map<String, Object> result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.intializeApp(initializeAppRequestArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
