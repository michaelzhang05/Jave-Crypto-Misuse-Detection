package com.mbridge.msdk.dycreator.d;

import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f18676a;

    /* renamed from: com.mbridge.msdk.dycreator.d.a$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18677a;

        static {
            int[] iArr = new int[EnumC0393a.values().length];
            f18677a = iArr;
            try {
                iArr[EnumC0393a.VIEW_OBSERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18677a[EnumC0393a.CLICK_OBSERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18677a[EnumC0393a.EFFECT_OBSERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18677a[EnumC0393a.REPORT_OBSERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0393a {
        VIEW_OBSERVER,
        CLICK_OBSERVER,
        EFFECT_OBSERVER,
        REPORT_OBSERVER
    }

    private a() {
    }

    public static a a() {
        if (f18676a == null) {
            synchronized (a.class) {
                try {
                    if (f18676a == null) {
                        f18676a = new a();
                    }
                } finally {
                }
            }
        }
        return f18676a;
    }

    public final <T extends com.mbridge.msdk.dycreator.g.a> T a(EnumC0393a enumC0393a) {
        int i8 = AnonymousClass1.f18677a[enumC0393a.ordinal()];
        if (i8 == 1) {
            return new d();
        }
        if (i8 == 2) {
            return new c();
        }
        if (i8 == 3) {
            return new f();
        }
        if (i8 != 4) {
            return null;
        }
        return new h();
    }
}
