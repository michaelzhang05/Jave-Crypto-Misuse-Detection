package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f1598a;

    /* renamed from: b, reason: collision with root package name */
    int f1599b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f1600c = -1;

    /* renamed from: d, reason: collision with root package name */
    private SparseArray f1601d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    private SparseArray f1602e = new SparseArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1603a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f1604b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        int f1605c;

        /* renamed from: d, reason: collision with root package name */
        d f1606d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f1605c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.R4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == h.S4) {
                    this.f1603a = obtainStyledAttributes.getResourceId(index, this.f1603a);
                } else if (index == h.T4) {
                    this.f1605c = obtainStyledAttributes.getResourceId(index, this.f1605c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1605c);
                    context.getResources().getResourceName(this.f1605c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1606d = dVar;
                        dVar.e(context, this.f1605c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f1604b.add(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        float f1607a;

        /* renamed from: b, reason: collision with root package name */
        float f1608b;

        /* renamed from: c, reason: collision with root package name */
        float f1609c;

        /* renamed from: d, reason: collision with root package name */
        float f1610d;

        /* renamed from: e, reason: collision with root package name */
        int f1611e;

        /* renamed from: f, reason: collision with root package name */
        d f1612f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f1607a = Float.NaN;
            this.f1608b = Float.NaN;
            this.f1609c = Float.NaN;
            this.f1610d = Float.NaN;
            this.f1611e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f1785n5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == h.f1792o5) {
                    this.f1611e = obtainStyledAttributes.getResourceId(index, this.f1611e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1611e);
                    context.getResources().getResourceName(this.f1611e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1612f = dVar;
                        dVar.e(context, this.f1611e);
                    }
                } else if (index == h.f1799p5) {
                    this.f1610d = obtainStyledAttributes.getDimension(index, this.f1610d);
                } else if (index == h.f1806q5) {
                    this.f1608b = obtainStyledAttributes.getDimension(index, this.f1608b);
                } else if (index == h.r5) {
                    this.f1609c = obtainStyledAttributes.getDimension(index, this.f1609c);
                } else if (index == h.s5) {
                    this.f1607a = obtainStyledAttributes.getDimension(index, this.f1607a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, ConstraintLayout constraintLayout, int i6) {
        this.f1598a = constraintLayout;
        a(context, i6);
    }

    private void a(Context context, int i6) {
        char c6;
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c6 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c6 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c6 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c6 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c6 = 3;
                                break;
                            }
                            break;
                    }
                    c6 = 65535;
                    if (c6 != 0 && c6 != 1) {
                        if (c6 == 2) {
                            aVar = new a(context, xml);
                            this.f1601d.put(aVar.f1603a, aVar);
                        } else if (c6 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (c6 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i6 = 0; i6 < attributeCount; i6++) {
            if ("id".equals(xmlPullParser.getAttributeName(i6))) {
                String attributeValue = xmlPullParser.getAttributeValue(i6);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.l(context, xmlPullParser);
                this.f1602e.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(e eVar) {
    }
}
