package A2;

import B6.a;
import O5.s;
import a6.InterfaceC1668n;
import android.content.SharedPreferences;
import kotlin.jvm.internal.AbstractC3247p;
import l6.AbstractC3360i;
import l6.C3347b0;
import l6.I;
import l6.M;

/* loaded from: classes4.dex */
public final class w implements i {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f246a;

    /* renamed from: b, reason: collision with root package name */
    private final I f247b;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f248a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f250c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, S5.d dVar) {
            super(2, dVar);
            this.f250c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f250c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            T5.b.e();
            if (this.f248a == 0) {
                O5.t.b(obj);
                String string = w.this.f246a.getString(this.f250c, null);
                if (string == null) {
                    return null;
                }
                w.this.f246a.edit().remove(this.f250c).apply();
                try {
                    s.a aVar = O5.s.f8302b;
                    a.C0011a c0011a = B6.a.f1006d;
                    c0011a.e();
                    b8 = O5.s.b((C0949g) c0011a.b(C0949g.Companion.serializer(), string));
                } catch (Throwable th) {
                    s.a aVar2 = O5.s.f8302b;
                    b8 = O5.s.b(O5.t.a(th));
                }
                if (O5.s.g(b8)) {
                    return null;
                }
                return b8;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    private w(SharedPreferences sharedPreferences, I i8) {
        this.f246a = sharedPreferences;
        this.f247b = i8;
    }

    @Override // A2.i
    public Object a(String str, S5.d dVar) {
        return AbstractC3360i.g(this.f247b, new a(str, null), dVar);
    }

    /* synthetic */ w(SharedPreferences sharedPreferences, I i8, int i9, AbstractC3247p abstractC3247p) {
        this(sharedPreferences, (i9 & 2) != 0 ? C3347b0.b() : i8);
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
            kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
            java.lang.String r0 = "StripeAnalyticsRequestV2Storage"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            java.lang.String r0 = "getSharedPreferences(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.w.<init>(android.app.Application):void");
    }
}
