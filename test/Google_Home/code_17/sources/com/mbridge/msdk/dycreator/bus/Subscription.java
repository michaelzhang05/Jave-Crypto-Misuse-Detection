package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
final class Subscription {

    /* renamed from: a, reason: collision with root package name */
    final Object f19728a;

    /* renamed from: b, reason: collision with root package name */
    final SubscriberMethod f19729b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f19728a = obj;
        this.f19729b = subscriberMethod;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        if (this.f19728a != subscription.f19728a || !this.f19729b.equals(subscription.f19729b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f19728a.hashCode() + this.f19729b.f19725d.hashCode();
    }
}
