package com.capacitorjs.plugins.pushnotifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.getcapacitor.a1;
import com.getcapacitor.g0;
import com.getcapacitor.j0;
import com.getcapacitor.r0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import com.getcapacitor.x0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.d;
import com.google.firebase.messaging.h0;
import com.google.firebase.messaging.o0;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@v0.b(name = "PushNotifications", permissions = {@v0.c(alias = PushNotificationsPlugin.PUSH_NOTIFICATIONS, strings = {"android.permission.POST_NOTIFICATIONS"})})
/* loaded from: classes.dex */
public class PushNotificationsPlugin extends u0 {
    private static final String EVENT_TOKEN_CHANGE = "registration";
    private static final String EVENT_TOKEN_ERROR = "registrationError";
    static final String PUSH_NOTIFICATIONS = "receive";
    public static o0 lastMessage;
    public static com.getcapacitor.h staticBridge;
    public MessagingService firebaseMessagingService;
    private v notificationChannelManager;
    public NotificationManager notificationManager;

    private Bundle getBundleLegacy() {
        try {
            return getContext().getPackageManager().getApplicationInfo(getContext().getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static PushNotificationsPlugin getPushNotificationsInstance() {
        x0 y5;
        com.getcapacitor.h hVar = staticBridge;
        if (hVar == null || hVar.G() == null || (y5 = staticBridge.y("PushNotifications")) == null) {
            return null;
        }
        return (PushNotificationsPlugin) y5.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$register$0(l2.i iVar) {
        if (iVar.m()) {
            sendToken((String) iVar.i());
        } else {
            sendError(iVar.h().getLocalizedMessage());
        }
    }

    public static void onNewToken(String str) {
        PushNotificationsPlugin pushNotificationsInstance = getPushNotificationsInstance();
        if (pushNotificationsInstance != null) {
            pushNotificationsInstance.sendToken(str);
        }
    }

    @v0.d
    private void permissionsCallback(v0 v0Var) {
        checkPermissions(v0Var);
    }

    public static void sendRemoteMessage(o0 o0Var) {
        PushNotificationsPlugin pushNotificationsInstance = getPushNotificationsInstance();
        if (pushNotificationsInstance != null) {
            pushNotificationsInstance.fireNotification(o0Var);
        } else {
            lastMessage = o0Var;
        }
    }

    @Override // com.getcapacitor.u0
    @a1
    public void checkPermissions(v0 v0Var) {
        if (Build.VERSION.SDK_INT >= 33) {
            super.checkPermissions(v0Var);
            return;
        }
        j0 j0Var = new j0();
        j0Var.m(PUSH_NOTIFICATIONS, "granted");
        v0Var.x(j0Var);
    }

    @a1
    public void createChannel(v0 v0Var) {
        this.notificationChannelManager.b(v0Var);
    }

    @a1
    public void deleteChannel(v0 v0Var) {
        this.notificationChannelManager.c(v0Var);
    }

    public void fireNotification(o0 o0Var) {
        Bundle bundle;
        PackageManager.ApplicationInfoFlags of;
        ApplicationInfo applicationInfo;
        j0 j0Var = new j0();
        j0 j0Var2 = new j0();
        j0Var.m("id", o0Var.b());
        for (String str : o0Var.a().keySet()) {
            j0Var2.put(str, o0Var.a().get(str));
        }
        j0Var.put("data", j0Var2);
        o0.b c6 = o0Var.c();
        if (c6 != null) {
            String e6 = c6.e();
            String a6 = c6.a();
            String[] a7 = getConfig().a("presentationOptions");
            if (a7 != null && Arrays.asList(a7).contains("alert")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    try {
                        PackageManager packageManager = getContext().getPackageManager();
                        String packageName = getContext().getPackageName();
                        of = PackageManager.ApplicationInfoFlags.of(128L);
                        applicationInfo = packageManager.getApplicationInfo(packageName, of);
                        bundle = applicationInfo.metaData;
                    } catch (PackageManager.NameNotFoundException e7) {
                        e7.printStackTrace();
                        bundle = null;
                    }
                } else {
                    bundle = getBundleLegacy();
                }
                if (bundle != null) {
                    h0 h0Var = new h0(o0Var.d().getExtras());
                    d.a d6 = com.google.firebase.messaging.d.d(getContext(), getContext(), h0Var, com.google.firebase.messaging.d.k(getContext(), h0Var.k(), bundle), bundle);
                    this.notificationManager.notify(d6.f5887b, d6.f5888c, d6.f5886a.b());
                }
            }
            j0Var.m("title", e6);
            j0Var.m("body", a6);
            j0Var.m("click_action", c6.b());
            Uri c7 = c6.c();
            if (c7 != null) {
                j0Var.m("link", c7.toString());
            }
        }
        notifyListeners("pushNotificationReceived", j0Var, true);
    }

    @a1
    public void getDeliveredNotifications(v0 v0Var) {
        StatusBarNotification[] activeNotifications;
        g0 g0Var = new g0();
        if (Build.VERSION.SDK_INT >= 23) {
            activeNotifications = this.notificationManager.getActiveNotifications();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                j0 j0Var = new j0();
                j0Var.put("id", statusBarNotification.getId());
                j0Var.m("tag", statusBarNotification.getTag());
                Notification notification = statusBarNotification.getNotification();
                if (notification != null) {
                    j0Var.put("title", notification.extras.getCharSequence("android.title"));
                    j0Var.put("body", notification.extras.getCharSequence("android.text"));
                    j0Var.m("group", notification.getGroup());
                    j0Var.put("groupSummary", (notification.flags & 512) != 0);
                    j0 j0Var2 = new j0();
                    for (String str : notification.extras.keySet()) {
                        j0Var2.m(str, notification.extras.getString(str));
                    }
                    j0Var.put("data", j0Var2);
                }
                g0Var.put(j0Var);
            }
        }
        j0 j0Var3 = new j0();
        j0Var3.put("notifications", g0Var);
        v0Var.x(j0Var3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnNewIntent(Intent intent) {
        super.handleOnNewIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("google.message_id")) {
            return;
        }
        j0 j0Var = new j0();
        j0 j0Var2 = new j0();
        for (String str : extras.keySet()) {
            if (str.equals("google.message_id")) {
                j0Var.m("id", extras.getString(str));
            } else {
                j0Var2.m(str, extras.getString(str));
            }
        }
        j0Var.put("data", j0Var2);
        j0 j0Var3 = new j0();
        j0Var3.m("actionId", "tap");
        j0Var3.put("notification", j0Var);
        notifyListeners("pushNotificationActionPerformed", j0Var3, true);
    }

    @a1
    public void listChannels(v0 v0Var) {
        this.notificationChannelManager.d(v0Var);
    }

    @Override // com.getcapacitor.u0
    public void load() {
        this.notificationManager = (NotificationManager) getActivity().getSystemService("notification");
        this.firebaseMessagingService = new MessagingService();
        staticBridge = this.bridge;
        o0 o0Var = lastMessage;
        if (o0Var != null) {
            fireNotification(o0Var);
            lastMessage = null;
        }
        this.notificationChannelManager = new v(getActivity(), this.notificationManager, getConfig());
    }

    @a1
    public void register(v0 v0Var) {
        FirebaseMessaging.n().D(true);
        FirebaseMessaging.n().q().c(new l2.d() { // from class: com.capacitorjs.plugins.pushnotifications.z
            @Override // l2.d
            public final void a(l2.i iVar) {
                PushNotificationsPlugin.this.lambda$register$0(iVar);
            }
        });
        v0Var.w();
    }

    @a1
    public void removeAllDeliveredNotifications(v0 v0Var) {
        this.notificationManager.cancelAll();
        v0Var.w();
    }

    @a1
    public void removeDeliveredNotifications(v0 v0Var) {
        try {
            for (Object obj : v0Var.c("notifications").a()) {
                if (obj instanceof JSONObject) {
                    j0 a6 = j0.a((JSONObject) obj);
                    String string = a6.getString("tag");
                    Integer d6 = a6.d("id");
                    if (string == null) {
                        this.notificationManager.cancel(d6.intValue());
                    } else {
                        this.notificationManager.cancel(string, d6.intValue());
                    }
                } else {
                    v0Var.r("Expected notifications to be a list of notification objects");
                }
            }
        } catch (JSONException e6) {
            v0Var.r(e6.getMessage());
        }
        v0Var.w();
    }

    @Override // com.getcapacitor.u0
    @a1
    public void requestPermissions(v0 v0Var) {
        if (Build.VERSION.SDK_INT >= 33 && getPermissionState(PUSH_NOTIFICATIONS) != r0.GRANTED) {
            requestPermissionForAlias(PUSH_NOTIFICATIONS, v0Var, "permissionsCallback");
            return;
        }
        j0 j0Var = new j0();
        j0Var.m(PUSH_NOTIFICATIONS, "granted");
        v0Var.x(j0Var);
    }

    public void sendError(String str) {
        j0 j0Var = new j0();
        j0Var.m("error", str);
        notifyListeners(EVENT_TOKEN_ERROR, j0Var, true);
    }

    public void sendToken(String str) {
        j0 j0Var = new j0();
        j0Var.m("value", str);
        notifyListeners(EVENT_TOKEN_CHANGE, j0Var, true);
    }

    @a1
    public void unregister(v0 v0Var) {
        FirebaseMessaging.n().D(false);
        FirebaseMessaging.n().k();
        v0Var.w();
    }
}
