package com.capacitorjs.plugins.pushnotifications;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.o0;

/* loaded from: classes.dex */
public class MessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q(o0 o0Var) {
        super.q(o0Var);
        PushNotificationsPlugin.sendRemoteMessage(o0Var);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void s(String str) {
        super.s(str);
        PushNotificationsPlugin.onNewToken(str);
    }
}
