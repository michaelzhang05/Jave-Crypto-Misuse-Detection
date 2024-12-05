package e3;

import M5.AbstractC1246t;
import M5.a0;
import b3.C1861F;
import b3.s;
import b3.v;
import com.stripe.android.model.p;
import com.stripe.android.model.t;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l2.C3166a;
import x2.j;

/* loaded from: classes4.dex */
public interface m {

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ String a(m mVar, Set set, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    set = a0.f();
                }
                return mVar.o(set);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildPaymentUserAgent");
        }

        public static /* synthetic */ Object b(m mVar, String str, j.c cVar, List list, P5.d dVar, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 4) != 0) {
                    list = AbstractC1246t.m();
                }
                return mVar.y(str, cVar, list, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrievePaymentIntent-BWLJW6A");
        }

        public static /* synthetic */ Object c(m mVar, String str, j.c cVar, List list, P5.d dVar, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 4) != 0) {
                    list = AbstractC1246t.m();
                }
                return mVar.h(str, cVar, list, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveSetupIntent-BWLJW6A");
        }

        public static /* synthetic */ Object d(m mVar, String str, j.c cVar, List list, P5.d dVar, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 4) != 0) {
                    list = AbstractC1246t.m();
                }
                return mVar.q(str, cVar, list, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveStripeIntent-BWLJW6A");
        }
    }

    Object A(Set set, String str, j.c cVar, P5.d dVar);

    Object B(p pVar, j.c cVar, P5.d dVar);

    Object a(String str, com.stripe.android.model.d dVar, j.c cVar, P5.d dVar2);

    Object b(C1861F c1861f, j.c cVar, P5.d dVar);

    Object c(String str, String str2, String str3, j.c cVar, List list, P5.d dVar);

    Object d(String str, j.c cVar, P5.d dVar);

    Object e(com.stripe.android.model.c cVar, j.c cVar2, List list, P5.d dVar);

    Object f(String str, j.c cVar, P5.d dVar);

    Object g(String str, Set set, j.c cVar, P5.d dVar);

    Object h(String str, j.c cVar, List list, P5.d dVar);

    Object i(s sVar, j.c cVar, P5.d dVar);

    Object j(String str, t tVar, j.c cVar, P5.d dVar);

    Object k(String str, String str2, String str3, j.c cVar, List list, P5.d dVar);

    Object l(String str, String str2, j.c cVar, P5.d dVar);

    Object m(String str, com.stripe.android.model.d dVar, j.c cVar, P5.d dVar2);

    Object n(C3166a c3166a, j.c cVar, P5.d dVar);

    String o(Set set);

    Object p(String str, String str2, Map map, j.c cVar, P5.d dVar);

    Object q(String str, j.c cVar, List list, P5.d dVar);

    Object r(j.c cVar, Map map, P5.d dVar);

    Object s(com.stripe.android.model.b bVar, j.c cVar, List list, P5.d dVar);

    Object t(String str, j.c cVar, P5.d dVar);

    Object u(com.stripe.android.model.l lVar, Set set, j.c cVar, P5.d dVar);

    Object v(String str, String str2, j.c cVar, P5.d dVar);

    Object w(v vVar, j.c cVar, P5.d dVar);

    Object x(j.c cVar, P5.d dVar);

    Object y(String str, j.c cVar, List list, P5.d dVar);

    Object z(String str, String str2, j.c cVar, P5.d dVar);
}
