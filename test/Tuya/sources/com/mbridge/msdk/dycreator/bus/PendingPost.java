package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class PendingPost {

    /* renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f18661d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    Object f18662a;

    /* renamed from: b, reason: collision with root package name */
    Subscription f18663b;

    /* renamed from: c, reason: collision with root package name */
    PendingPost f18664c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f18662a = obj;
        this.f18663b = subscription;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f18661d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size > 0) {
                    PendingPost remove = list.remove(size - 1);
                    remove.f18662a = obj;
                    remove.f18663b = subscription;
                    remove.f18664c = null;
                    return remove;
                }
                return new PendingPost(obj, subscription);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(PendingPost pendingPost) {
        pendingPost.f18662a = null;
        pendingPost.f18663b = null;
        pendingPost.f18664c = null;
        List<PendingPost> list = f18661d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
