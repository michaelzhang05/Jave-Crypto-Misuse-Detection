package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2089c3 extends AbstractC2091c5 implements K5 {
    private static final C2089c3 zzc;
    private static volatile P5 zzd;
    private InterfaceC2180l5 zze = AbstractC2091c5.C();

    /* renamed from: com.google.android.gms.internal.measurement.c3$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2091c5.b implements K5 {
        private a() {
            super(C2089c3.zzc);
        }
    }

    static {
        C2089c3 c2089c3 = new C2089c3();
        zzc = c2089c3;
        AbstractC2091c5.r(C2089c3.class, c2089c3);
    }

    private C2089c3() {
    }

    public static C2089c3 H() {
        return zzc;
    }

    public final List I() {
        return this.zze;
    }

    public final int j() {
        return this.zze.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2091c5
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2139h3.f16658a[i8 - 1]) {
            case 1:
                return new C2089c3();
            case 2:
                return new a();
            case 3:
                return AbstractC2091c5.p(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C2099d3.class});
            case 4:
                return zzc;
            case 5:
                P5 p52 = zzd;
                if (p52 == null) {
                    synchronized (C2089c3.class) {
                        try {
                            p52 = zzd;
                            if (p52 == null) {
                                p52 = new AbstractC2091c5.a(zzc);
                                zzd = p52;
                            }
                        } finally {
                        }
                    }
                }
                return p52;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
