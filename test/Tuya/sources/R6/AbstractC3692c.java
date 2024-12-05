package r6;

import n6.C3486F;

/* renamed from: r6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3692c {

    /* renamed from: a, reason: collision with root package name */
    private static final C3486F f37673a = new C3486F("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    private static final C3486F f37674b = new C3486F("ALREADY_LOCKED_BY_OWNER");

    public static final InterfaceC3690a a(boolean z8) {
        return new C3691b(z8);
    }

    public static /* synthetic */ InterfaceC3690a b(boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return a(z8);
    }
}
