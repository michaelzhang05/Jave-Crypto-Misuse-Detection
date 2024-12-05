package u6;

import q6.C3865F;

/* renamed from: u6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4065c {

    /* renamed from: a, reason: collision with root package name */
    private static final C3865F f40053a = new C3865F("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    private static final C3865F f40054b = new C3865F("ALREADY_LOCKED_BY_OWNER");

    public static final InterfaceC4063a a(boolean z8) {
        return new C4064b(z8);
    }

    public static /* synthetic */ InterfaceC4063a b(boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return a(z8);
    }
}
