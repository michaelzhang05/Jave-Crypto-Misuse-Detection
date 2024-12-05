package X2;

import L5.s;
import M5.AbstractC1246t;
import V5.i;
import com.stripe.android.model.StripeIntent;
import e4.H0;
import e4.s0;
import g6.C2728d;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f12223a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f12224b;

        /* renamed from: c, reason: collision with root package name */
        private final String f12225c;

        public a(List sharedDataSpecs, boolean z8, String str) {
            AbstractC3159y.i(sharedDataSpecs, "sharedDataSpecs");
            this.f12223a = sharedDataSpecs;
            this.f12224b = z8;
            this.f12225c = str;
        }

        public final String a() {
            return this.f12225c;
        }

        public final boolean b() {
            return this.f12224b;
        }

        public final List c() {
            return this.f12223a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f12223a, aVar.f12223a) && this.f12224b == aVar.f12224b && AbstractC3159y.d(this.f12225c, aVar.f12225c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f12223a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f12224b)) * 31;
            String str = this.f12225c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Result(sharedDataSpecs=" + this.f12223a + ", failedToParseServerResponse=" + this.f12224b + ", failedToParseServerErrorMessage=" + this.f12225c + ")";
        }
    }

    private final String a(InputStream inputStream) {
        BufferedReader bufferedReader;
        String f8;
        if (inputStream != null) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C2728d.f31293b), 8192);
        } else {
            bufferedReader = null;
        }
        if (bufferedReader != null) {
            try {
                f8 = i.f(bufferedReader);
            } finally {
            }
        } else {
            f8 = null;
        }
        V5.b.a(bufferedReader, null);
        return f8;
    }

    private final List c(InputStream inputStream) {
        List list;
        String a8 = a(inputStream);
        if (a8 != null) {
            Object a9 = s0.f30820a.a(a8);
            if (s.e(a9) != null) {
                a9 = AbstractC1246t.m();
            }
            list = (List) a9;
        } else {
            list = null;
        }
        if (list == null) {
            return AbstractC1246t.m();
        }
        return list;
    }

    private final List d() {
        ClassLoader classLoader = d.class.getClassLoader();
        AbstractC3159y.f(classLoader);
        return c(classLoader.getResourceAsStream("lpms.json"));
    }

    public final a b(StripeIntent stripeIntent, String str) {
        boolean z8;
        AbstractC3159y.i(stripeIntent, "stripeIntent");
        List g8 = stripeIntent.g();
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        if (str != null && str.length() != 0) {
            Object a8 = s0.f30820a.a(str);
            z8 = s.g(a8);
            Throwable e8 = s.e(a8);
            if (e8 != null) {
                str2 = e8.getMessage();
            }
            if (s.e(a8) != null) {
                a8 = AbstractC1246t.m();
            }
            AbstractC1246t.D(arrayList, (Iterable) a8);
        } else {
            z8 = false;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((H0) it.next()).getType());
        }
        Set b12 = AbstractC1246t.b1(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : g8) {
            if (!b12.contains((String) obj)) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            List d8 = d();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : d8) {
                if (arrayList3.contains(((H0) obj2).getType())) {
                    arrayList4.add(obj2);
                }
            }
            AbstractC1246t.D(arrayList, arrayList4);
        }
        return new a(arrayList, z8, str2);
    }
}
