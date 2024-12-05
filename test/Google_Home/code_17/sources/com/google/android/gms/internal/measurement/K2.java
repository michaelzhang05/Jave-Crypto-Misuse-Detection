package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public enum K2 implements InterfaceC2141h5 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);


    /* renamed from: a, reason: collision with root package name */
    private final int f16173a;

    K2(int i8) {
        this.f16173a = i8;
    }

    public static K2 a(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 != 5) {
                                return null;
                            }
                            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
                        }
                        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
                    }
                    return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
                }
                return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
            }
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
    }

    public static InterfaceC2131g5 b() {
        return J2.f16156a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + K2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16173a + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2141h5
    public final int w() {
        return this.f16173a;
    }
}
