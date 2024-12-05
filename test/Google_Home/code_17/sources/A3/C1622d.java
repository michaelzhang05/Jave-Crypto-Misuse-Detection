package a3;

import O5.s;
import P5.AbstractC1378t;
import Y5.i;
import com.stripe.android.model.StripeIntent;
import h4.H0;
import h4.s0;
import j6.C3205d;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: a3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1622d {

    /* renamed from: a3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f13844a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f13845b;

        /* renamed from: c, reason: collision with root package name */
        private final String f13846c;

        public a(List sharedDataSpecs, boolean z8, String str) {
            AbstractC3255y.i(sharedDataSpecs, "sharedDataSpecs");
            this.f13844a = sharedDataSpecs;
            this.f13845b = z8;
            this.f13846c = str;
        }

        public final String a() {
            return this.f13846c;
        }

        public final boolean b() {
            return this.f13845b;
        }

        public final List c() {
            return this.f13844a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f13844a, aVar.f13844a) && this.f13845b == aVar.f13845b && AbstractC3255y.d(this.f13846c, aVar.f13846c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f13844a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f13845b)) * 31;
            String str = this.f13846c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Result(sharedDataSpecs=" + this.f13844a + ", failedToParseServerResponse=" + this.f13845b + ", failedToParseServerErrorMessage=" + this.f13846c + ")";
        }
    }

    private final String a(InputStream inputStream) {
        BufferedReader bufferedReader;
        String f8;
        if (inputStream != null) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C3205d.f34020b), 8192);
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
        Y5.b.a(bufferedReader, null);
        return f8;
    }

    private final List c(InputStream inputStream) {
        List list;
        String a8 = a(inputStream);
        if (a8 != null) {
            Object a9 = s0.f32741a.a(a8);
            if (s.e(a9) != null) {
                a9 = AbstractC1378t.m();
            }
            list = (List) a9;
        } else {
            list = null;
        }
        if (list == null) {
            return AbstractC1378t.m();
        }
        return list;
    }

    private final List d() {
        ClassLoader classLoader = C1622d.class.getClassLoader();
        AbstractC3255y.f(classLoader);
        return c(classLoader.getResourceAsStream("lpms.json"));
    }

    public final a b(StripeIntent stripeIntent, String str) {
        boolean z8;
        AbstractC3255y.i(stripeIntent, "stripeIntent");
        List e8 = stripeIntent.e();
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        if (str != null && str.length() != 0) {
            Object a8 = s0.f32741a.a(str);
            z8 = s.g(a8);
            Throwable e9 = s.e(a8);
            if (e9 != null) {
                str2 = e9.getMessage();
            }
            if (s.e(a8) != null) {
                a8 = AbstractC1378t.m();
            }
            AbstractC1378t.D(arrayList, (Iterable) a8);
        } else {
            z8 = false;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((H0) it.next()).getType());
        }
        Set b12 = AbstractC1378t.b1(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : e8) {
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
            AbstractC1378t.D(arrayList, arrayList4);
        }
        return new a(arrayList, z8, str2);
    }
}
