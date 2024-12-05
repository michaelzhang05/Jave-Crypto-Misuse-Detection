package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class PendingPost {

    /* renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f19716d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    Object f19717a;

    /* renamed from: b, reason: collision with root package name */
    Subscription f19718b;

    /* renamed from: c, reason: collision with root package name */
    PendingPost f19719c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f19717a = obj;
        this.f19718b = subscription;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f19716d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size > 0) {
                    PendingPost remove = list.remove(size - 1);
                    remove.f19717a = obj;
                    remove.f19718b = subscription;
                    remove.f19719c = null;
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
        pendingPost.f19717a = null;
        pendingPost.f19718b = null;
        pendingPost.f19719c = null;
        List<PendingPost> list = f19716d;
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
