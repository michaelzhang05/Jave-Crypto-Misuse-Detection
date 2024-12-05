package com.stripe.android.googlepaylauncher;

import O5.p;
import com.stripe.android.googlepaylauncher.d;
import com.stripe.android.googlepaylauncher.h;
import kotlin.jvm.internal.AbstractC3255y;
import m2.C3427m;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.stripe.android.googlepaylauncher.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0468a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24889a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f24890b;

        static {
            int[] iArr = new int[d.b.values().length];
            try {
                iArr[d.b.f24914b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.b.f24915c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24889a = iArr;
            int[] iArr2 = new int[h.b.EnumC0472b.values().length];
            try {
                iArr2[h.b.EnumC0472b.f24987b.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[h.b.EnumC0472b.f24988c.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f24890b = iArr2;
        }
    }

    public static final C3427m.a a(d dVar) {
        C3427m.a.b bVar;
        AbstractC3255y.i(dVar, "<this>");
        boolean g8 = dVar.g();
        int i8 = C0468a.f24889a[dVar.a().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                bVar = C3427m.a.b.f34988c;
            } else {
                throw new p();
            }
        } else {
            bVar = C3427m.a.b.f34987b;
        }
        return new C3427m.a(g8, bVar, dVar.b());
    }

    public static final C3427m.a b(h.b bVar) {
        C3427m.a.b bVar2;
        AbstractC3255y.i(bVar, "<this>");
        boolean g8 = bVar.g();
        int i8 = C0468a.f24890b[bVar.a().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                bVar2 = C3427m.a.b.f34988c;
            } else {
                throw new p();
            }
        } else {
            bVar2 = C3427m.a.b.f34987b;
        }
        return new C3427m.a(g8, bVar2, bVar.b());
    }
}
