package x2;

import L5.s;
import android.content.SharedPreferences;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.I;
import i6.M;
import kotlin.jvm.internal.AbstractC3151p;
import y6.AbstractC3999a;

/* loaded from: classes4.dex */
public final class w implements i {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f39251a;

    /* renamed from: b, reason: collision with root package name */
    private final I f39252b;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f39253a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f39255c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, P5.d dVar) {
            super(2, dVar);
            this.f39255c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f39255c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Q5.b.e();
            if (this.f39253a == 0) {
                L5.t.b(obj);
                String string = w.this.f39251a.getString(this.f39255c, null);
                if (string == null) {
                    return null;
                }
                w.this.f39251a.edit().remove(this.f39255c).apply();
                try {
                    s.a aVar = L5.s.f6511b;
                    AbstractC3999a.C0918a c0918a = AbstractC3999a.f39962d;
                    c0918a.e();
                    b8 = L5.s.b((C3877g) c0918a.b(C3877g.Companion.serializer(), string));
                } catch (Throwable th) {
                    s.a aVar2 = L5.s.f6511b;
                    b8 = L5.s.b(L5.t.a(th));
                }
                if (L5.s.g(b8)) {
                    return null;
                }
                return b8;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private w(SharedPreferences sharedPreferences, I i8) {
        this.f39251a = sharedPreferences;
        this.f39252b = i8;
    }

    @Override // x2.i
    public Object a(String str, P5.d dVar) {
        return AbstractC2825i.g(this.f39252b, new a(str, null), dVar);
    }

    /* synthetic */ w(SharedPreferences sharedPreferences, I i8, int i9, AbstractC3151p abstractC3151p) {
        this(sharedPreferences, (i9 & 2) != 0 ? C2812b0.b() : i8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(android.app.Application r3) {
        /*
            r2 = this;
            java.lang.String r0 = "application"
            kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
            java.lang.String r0 = "StripeAnalyticsRequestV2Storage"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            java.lang.String r0 = "getSharedPreferences(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.w.<init>(android.app.Application):void");
    }
}
