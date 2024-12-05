package h3;

import A2.j;
import P5.AbstractC1378t;
import P5.a0;
import com.stripe.android.model.p;
import com.stripe.android.model.t;
import e3.C2782F;
import e3.s;
import e3.v;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o2.C3514a;

/* loaded from: classes4.dex */
public interface m {

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ String a(m mVar, Set set, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    set = a0.f();
                }
                return mVar.q(set);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildPaymentUserAgent");
        }

        public static /* synthetic */ Object b(m mVar, String str, j.c cVar, List list, S5.d dVar, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 4) != 0) {
                    list = AbstractC1378t.m();
                }
                return mVar.i(str, cVar, list, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrievePaymentIntent-BWLJW6A");
        }

        public static /* synthetic */ Object c(m mVar, String str, j.c cVar, List list, S5.d dVar, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 4) != 0) {
                    list = AbstractC1378t.m();
                }
                return mVar.b(str, cVar, list, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveSetupIntent-BWLJW6A");
        }

        public static /* synthetic */ Object d(m mVar, String str, j.c cVar, List list, S5.d dVar, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 4) != 0) {
                    list = AbstractC1378t.m();
                }
                return mVar.l(str, cVar, list, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveStripeIntent-BWLJW6A");
        }
    }

    Object A(com.stripe.android.model.c cVar, j.c cVar2, List list, S5.d dVar);

    Object B(String str, j.c cVar, S5.d dVar);

    Object a(j.c cVar, Map map, S5.d dVar);

    Object b(String str, j.c cVar, List list, S5.d dVar);

    Object c(String str, String str2, String str3, j.c cVar, List list, S5.d dVar);

    Object d(String str, com.stripe.android.model.d dVar, j.c cVar, S5.d dVar2);

    Object e(String str, t tVar, j.c cVar, S5.d dVar);

    Object f(C3514a c3514a, j.c cVar, S5.d dVar);

    Object g(j.c cVar, S5.d dVar);

    Object h(String str, String str2, j.c cVar, S5.d dVar);

    Object i(String str, j.c cVar, List list, S5.d dVar);

    Object j(String str, String str2, String str3, j.c cVar, List list, S5.d dVar);

    Object k(String str, com.stripe.android.model.d dVar, j.c cVar, S5.d dVar2);

    Object l(String str, j.c cVar, List list, S5.d dVar);

    Object m(String str, String str2, Map map, j.c cVar, S5.d dVar);

    Object n(p pVar, j.c cVar, S5.d dVar);

    Object o(com.stripe.android.model.l lVar, Set set, j.c cVar, S5.d dVar);

    Object p(String str, String str2, j.c cVar, S5.d dVar);

    String q(Set set);

    Object r(String str, Set set, j.c cVar, S5.d dVar);

    Object s(C2782F c2782f, j.c cVar, S5.d dVar);

    Object t(String str, String str2, j.c cVar, S5.d dVar);

    Object u(Set set, String str, j.c cVar, S5.d dVar);

    Object v(com.stripe.android.model.b bVar, j.c cVar, List list, S5.d dVar);

    Object w(s sVar, j.c cVar, S5.d dVar);

    Object x(String str, j.c cVar, S5.d dVar);

    Object y(v vVar, j.c cVar, S5.d dVar);

    Object z(String str, j.c cVar, S5.d dVar);
}
