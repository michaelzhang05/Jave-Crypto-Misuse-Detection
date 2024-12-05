package com.stripe.android.paymentsheet.analytics;

import B3.f;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.stripe.android.paymentsheet.u;
import e3.EnumC2791e;
import e3.y;
import java.util.List;
import t3.EnumC4032f;
import w3.AbstractC4146b;

/* loaded from: classes4.dex */
public interface EventReporter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f26778b = new Mode("Complete", 0, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f26779c = new Mode(TypedValues.Custom.NAME, 1, "custom");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ Mode[] f26780d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ U5.a f26781e;

        /* renamed from: a, reason: collision with root package name */
        private final String f26782a;

        static {
            Mode[] a8 = a();
            f26780d = a8;
            f26781e = U5.b.a(a8);
        }

        private Mode(String str, int i8, String str2) {
            this.f26782a = str2;
        }

        private static final /* synthetic */ Mode[] a() {
            return new Mode[]{f26778b, f26779c};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f26780d.clone();
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f26782a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26783a = new a("Edit", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f26784b = new a("Add", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f26785c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ U5.a f26786d;

        static {
            a[] a8 = a();
            f26785c = a8;
            f26786d = U5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f26783a, f26784b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f26785c.clone();
        }
    }

    void a();

    void b(EnumC2791e enumC2791e);

    void c(EnumC2791e enumC2791e, Throwable th);

    void d(a aVar, EnumC2791e enumC2791e);

    void e();

    void f(String str);

    void g();

    void h(String str);

    void i(f fVar);

    void j(f fVar);

    void k(boolean z8);

    void l(u.g gVar, boolean z8);

    void m(f fVar, y yVar, boolean z8, String str, u.l lVar, List list);

    void n(Throwable th);

    void o(f fVar, AbstractC4146b abstractC4146b);

    void onDismiss();

    void p(a aVar, EnumC2791e enumC2791e);

    void q(String str);

    void r(Throwable th);

    void s(String str);

    void t();

    void u(f fVar, EnumC4032f enumC4032f);

    void v();

    void w();

    void x(String str);
}
