package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static int a(TypedArray typedArray, int i6) {
            return typedArray.getType(i6);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final d[] f2042a;

        public c(d[] dVarArr) {
            this.f2042a = dVarArr;
        }

        public d[] a() {
            return this.f2042a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f2043a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2044b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f2045c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2046d;

        /* renamed from: e, reason: collision with root package name */
        private final int f2047e;

        /* renamed from: f, reason: collision with root package name */
        private final int f2048f;

        public d(String str, int i6, boolean z5, String str2, int i7, int i8) {
            this.f2043a = str;
            this.f2044b = i6;
            this.f2045c = z5;
            this.f2046d = str2;
            this.f2047e = i7;
            this.f2048f = i8;
        }

        public String a() {
            return this.f2043a;
        }

        public int b() {
            return this.f2048f;
        }

        public int c() {
            return this.f2047e;
        }

        public String d() {
            return this.f2046d;
        }

        public int e() {
            return this.f2044b;
        }

        public boolean f() {
            return this.f2045c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0026e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.provider.e f2049a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2050b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2051c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2052d;

        public C0026e(androidx.core.provider.e eVar, int i6, int i7, String str) {
            this.f2049a = eVar;
            this.f2051c = i6;
            this.f2050b = i7;
            this.f2052d = str;
        }

        public int a() {
            return this.f2051c;
        }

        public androidx.core.provider.e b() {
            return this.f2049a;
        }

        public String c() {
            return this.f2052d;
        }

        public int d() {
            return this.f2050b;
        }
    }

    private static int a(TypedArray typedArray, int i6) {
        return a.a(typedArray, i6);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i6) {
        if (i6 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i6);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i7 = 0; i7 < obtainTypedArray.length(); i7++) {
                    int resourceId = obtainTypedArray.getResourceId(i7, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i6)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), s.d.f9168h);
        String string = obtainAttributes.getString(s.d.f9169i);
        String string2 = obtainAttributes.getString(s.d.f9173m);
        String string3 = obtainAttributes.getString(s.d.f9174n);
        int resourceId = obtainAttributes.getResourceId(s.d.f9170j, 0);
        int integer = obtainAttributes.getInteger(s.d.f9171k, 1);
        int integer2 = obtainAttributes.getInteger(s.d.f9172l, 500);
        String string4 = obtainAttributes.getString(s.d.f9175o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0026e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), s.d.f9176p);
        int i6 = obtainAttributes.getInt(obtainAttributes.hasValue(s.d.f9185y) ? s.d.f9185y : s.d.f9178r, 400);
        boolean z5 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(s.d.f9183w) ? s.d.f9183w : s.d.f9179s, 0);
        int i7 = obtainAttributes.hasValue(s.d.f9186z) ? s.d.f9186z : s.d.f9180t;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(s.d.f9184x) ? s.d.f9184x : s.d.f9181u);
        int i8 = obtainAttributes.getInt(i7, 0);
        int i9 = obtainAttributes.hasValue(s.d.f9182v) ? s.d.f9182v : s.d.f9177q;
        int resourceId = obtainAttributes.getResourceId(i9, 0);
        String string2 = obtainAttributes.getString(i9);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i6, z5, string, i8, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i6 = 1;
        while (i6 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i6++;
            } else if (next == 3) {
                i6--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
