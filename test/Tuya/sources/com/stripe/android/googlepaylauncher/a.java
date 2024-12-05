package com.stripe.android.googlepaylauncher;

import L5.p;
import com.stripe.android.googlepaylauncher.d;
import com.stripe.android.googlepaylauncher.h;
import j2.C3073m;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.stripe.android.googlepaylauncher.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0472a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23834a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f23835b;

        static {
            int[] iArr = new int[d.b.values().length];
            try {
                iArr[d.b.f23859b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.b.f23860c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23834a = iArr;
            int[] iArr2 = new int[h.b.EnumC0476b.values().length];
            try {
                iArr2[h.b.EnumC0476b.f23932b.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[h.b.EnumC0476b.f23933c.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f23835b = iArr2;
        }
    }

    public static final C3073m.a a(d dVar) {
        C3073m.a.b bVar;
        AbstractC3159y.i(dVar, "<this>");
        boolean e8 = dVar.e();
        int i8 = C0472a.f23834a[dVar.b().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                bVar = C3073m.a.b.f33012c;
            } else {
                throw new p();
            }
        } else {
            bVar = C3073m.a.b.f33011b;
        }
        return new C3073m.a(e8, bVar, dVar.c());
    }

    public static final C3073m.a b(h.b bVar) {
        C3073m.a.b bVar2;
        AbstractC3159y.i(bVar, "<this>");
        boolean e8 = bVar.e();
        int i8 = C0472a.f23835b[bVar.b().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                bVar2 = C3073m.a.b.f33012c;
            } else {
                throw new p();
            }
        } else {
            bVar2 = C3073m.a.b.f33011b;
        }
        return new C3073m.a(e8, bVar2, bVar.c());
    }
}
