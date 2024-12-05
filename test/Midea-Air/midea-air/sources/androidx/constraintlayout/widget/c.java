package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public class c {
    private final ConstraintLayout a;

    /* renamed from: b, reason: collision with root package name */
    int f712b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f713c = -1;

    /* renamed from: d, reason: collision with root package name */
    private SparseArray<a> f714d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<d> f715e = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class a {
        int a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<b> f716b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f717c;

        /* renamed from: d, reason: collision with root package name */
        d f718d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f717c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.F4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == i.G4) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == i.H4) {
                    this.f717c = obtainStyledAttributes.getResourceId(index, this.f717c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f717c);
                    context.getResources().getResourceName(this.f717c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f718d = dVar;
                        dVar.e(context, this.f717c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f716b.add(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class b {
        float a;

        /* renamed from: b, reason: collision with root package name */
        float f719b;

        /* renamed from: c, reason: collision with root package name */
        float f720c;

        /* renamed from: d, reason: collision with root package name */
        float f721d;

        /* renamed from: e, reason: collision with root package name */
        int f722e;

        /* renamed from: f, reason: collision with root package name */
        d f723f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.a = Float.NaN;
            this.f719b = Float.NaN;
            this.f720c = Float.NaN;
            this.f721d = Float.NaN;
            this.f722e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.b5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == i.c5) {
                    this.f722e = obtainStyledAttributes.getResourceId(index, this.f722e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f722e);
                    context.getResources().getResourceName(this.f722e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f723f = dVar;
                        dVar.e(context, this.f722e);
                    }
                } else if (index == i.d5) {
                    this.f721d = obtainStyledAttributes.getDimension(index, this.f721d);
                } else if (index == i.e5) {
                    this.f719b = obtainStyledAttributes.getDimension(index, this.f719b);
                } else if (index == i.f5) {
                    this.f720c = obtainStyledAttributes.getDimension(index, this.f720c);
                } else if (index == i.g5) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, ConstraintLayout constraintLayout, int i2) {
        this.a = constraintLayout;
        a(context, i2);
    }

    private void a(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c2 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0 && c2 != 1) {
                        if (c2 == 2) {
                            aVar = new a(context, xml);
                            this.f714d.put(aVar.a, aVar);
                        } else if (c2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (c2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (DeepLinkIntentReceiver.DeepLinksKeys.ID.equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), DeepLinkIntentReceiver.DeepLinksKeys.ID, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.m(context, xmlPullParser);
                this.f715e.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }
}
