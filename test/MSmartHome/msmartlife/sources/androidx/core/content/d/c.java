package androidx.core.content.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat.java */
/* loaded from: classes.dex */
public class c {

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class b implements a {
        private final C0019c[] a;

        public b(C0019c[] c0019cArr) {
            this.a = c0019cArr;
        }

        public C0019c[] a() {
            return this.a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.d.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0019c {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private int f908b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f909c;

        /* renamed from: d, reason: collision with root package name */
        private String f910d;

        /* renamed from: e, reason: collision with root package name */
        private int f911e;

        /* renamed from: f, reason: collision with root package name */
        private int f912f;

        public C0019c(String str, int i2, boolean z, String str2, int i3, int i4) {
            this.a = str;
            this.f908b = i2;
            this.f909c = z;
            this.f910d = str2;
            this.f911e = i3;
            this.f912f = i4;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f912f;
        }

        public int c() {
            return this.f911e;
        }

        public String d() {
            return this.f910d;
        }

        public int e() {
            return this.f908b;
        }

        public boolean f() {
            return this.f909c;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class d implements a {
        private final c.h.h.d a;

        /* renamed from: b, reason: collision with root package name */
        private final int f913b;

        /* renamed from: c, reason: collision with root package name */
        private final int f914c;

        /* renamed from: d, reason: collision with root package name */
        private final String f915d;

        public d(c.h.h.d dVar, int i2, int i3, String str) {
            this.a = dVar;
            this.f914c = i2;
            this.f913b = i3;
            this.f915d = str;
        }

        public int a() {
            return this.f914c;
        }

        public c.h.h.d b() {
            return this.a;
        }

        public String c() {
            return this.f915d;
        }

        public int d() {
            return this.f913b;
        }
    }

    private static int a(TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i2);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
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

    public static List<List<byte[]>> c(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c.h.d.f2645f);
        String string = obtainAttributes.getString(c.h.d.f2646g);
        String string2 = obtainAttributes.getString(c.h.d.f2650k);
        String string3 = obtainAttributes.getString(c.h.d.l);
        int resourceId = obtainAttributes.getResourceId(c.h.d.f2647h, 0);
        int integer = obtainAttributes.getInteger(c.h.d.f2648i, 1);
        int integer2 = obtainAttributes.getInteger(c.h.d.f2649j, 500);
        String string4 = obtainAttributes.getString(c.h.d.m);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new c.h.h.d(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
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
        return new b((C0019c[]) arrayList.toArray(new C0019c[arrayList.size()]));
    }

    private static C0019c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c.h.d.n);
        int i2 = c.h.d.w;
        if (!obtainAttributes.hasValue(i2)) {
            i2 = c.h.d.p;
        }
        int i3 = obtainAttributes.getInt(i2, 400);
        int i4 = c.h.d.u;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = c.h.d.q;
        }
        boolean z = 1 == obtainAttributes.getInt(i4, 0);
        int i5 = c.h.d.x;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = c.h.d.r;
        }
        int i6 = c.h.d.v;
        if (!obtainAttributes.hasValue(i6)) {
            i6 = c.h.d.s;
        }
        String string = obtainAttributes.getString(i6);
        int i7 = obtainAttributes.getInt(i5, 0);
        int i8 = c.h.d.t;
        if (!obtainAttributes.hasValue(i8)) {
            i8 = c.h.d.o;
        }
        int resourceId = obtainAttributes.getResourceId(i8, 0);
        String string2 = obtainAttributes.getString(i8);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0019c(string2, i3, z, string, i7, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
