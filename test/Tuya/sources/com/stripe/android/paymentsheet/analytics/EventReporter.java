package com.stripe.android.paymentsheet.analytics;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import b3.EnumC1870e;
import b3.y;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.stripe.android.paymentsheet.u;
import java.util.List;
import q3.EnumC3653f;
import t3.AbstractC3792b;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public interface EventReporter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f25723b = new Mode("Complete", 0, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f25724c = new Mode(TypedValues.Custom.NAME, 1, "custom");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ Mode[] f25725d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f25726e;

        /* renamed from: a, reason: collision with root package name */
        private final String f25727a;

        static {
            Mode[] a8 = a();
            f25725d = a8;
            f25726e = R5.b.a(a8);
        }

        private Mode(String str, int i8, String str2) {
            this.f25727a = str2;
        }

        private static final /* synthetic */ Mode[] a() {
            return new Mode[]{f25723b, f25724c};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f25725d.clone();
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25727a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25728a = new a("Edit", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f25729b = new a("Add", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f25730c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ R5.a f25731d;

        static {
            a[] a8 = a();
            f25730c = a8;
            f25731d = R5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f25728a, f25729b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f25730c.clone();
        }
    }

    void a();

    void b(EnumC1870e enumC1870e, Throwable th);

    void c(EnumC1870e enumC1870e);

    void d();

    void e(String str);

    void f();

    void g(AbstractC3991f abstractC3991f, AbstractC3792b abstractC3792b);

    void h(String str);

    void i(boolean z8);

    void j(u.g gVar, boolean z8);

    void k(AbstractC3991f abstractC3991f);

    void l(a aVar, EnumC1870e enumC1870e);

    void m(AbstractC3991f abstractC3991f, EnumC3653f enumC3653f);

    void n(Throwable th);

    void o(String str);

    void onDismiss();

    void p(Throwable th);

    void q(String str);

    void r();

    void s(AbstractC3991f abstractC3991f);

    void t(AbstractC3991f abstractC3991f, y yVar, boolean z8, String str, u.l lVar, List list);

    void u(a aVar, EnumC1870e enumC1870e);

    void v();

    void w();

    void x(String str);
}
