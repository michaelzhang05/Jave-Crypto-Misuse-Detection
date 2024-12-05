package com.mbridge.msdk.dycreator.d;

import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f19731a;

    /* renamed from: com.mbridge.msdk.dycreator.d.a$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19732a;

        static {
            int[] iArr = new int[EnumC0389a.values().length];
            f19732a = iArr;
            try {
                iArr[EnumC0389a.VIEW_OBSERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19732a[EnumC0389a.CLICK_OBSERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19732a[EnumC0389a.EFFECT_OBSERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19732a[EnumC0389a.REPORT_OBSERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0389a {
        VIEW_OBSERVER,
        CLICK_OBSERVER,
        EFFECT_OBSERVER,
        REPORT_OBSERVER
    }

    private a() {
    }

    public static a a() {
        if (f19731a == null) {
            synchronized (a.class) {
                try {
                    if (f19731a == null) {
                        f19731a = new a();
                    }
                } finally {
                }
            }
        }
        return f19731a;
    }

    public final <T extends com.mbridge.msdk.dycreator.g.a> T a(EnumC0389a enumC0389a) {
        int i8 = AnonymousClass1.f19732a[enumC0389a.ordinal()];
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
