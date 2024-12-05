package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3127f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Class[] f3128g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    private final Map f3129a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f3130b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f3131c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f3132d;

    /* renamed from: e, reason: collision with root package name */
    private final a.c f3133e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f5.f fVar) {
            this();
        }

        public final y a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new y();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    f5.h.d(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new y(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = parcelableArrayList.get(i6);
                f5.h.c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i6));
            }
            return new y(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : y.f3128g) {
                f5.h.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public y() {
        this.f3129a = new LinkedHashMap();
        this.f3130b = new LinkedHashMap();
        this.f3131c = new LinkedHashMap();
        this.f3132d = new LinkedHashMap();
        this.f3133e = new a.c() { // from class: androidx.lifecycle.x
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle d6;
                d6 = y.d(y.this);
                return d6;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(y yVar) {
        Map i6;
        f5.h.e(yVar, "this$0");
        i6 = a5.e0.i(yVar.f3130b);
        for (Map.Entry entry : i6.entrySet()) {
            yVar.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = yVar.f3129a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(yVar.f3129a.get(str));
        }
        return androidx.core.os.e.a(z4.i.a("keys", arrayList), z4.i.a("values", arrayList2));
    }

    public final a.c c() {
        return this.f3133e;
    }

    public final void e(String str, Object obj) {
        f5.h.e(str, "key");
        if (!f3127f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            f5.h.b(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f3131c.get(str);
        q qVar = obj2 instanceof q ? (q) obj2 : null;
        if (qVar != null) {
            qVar.k(obj);
        } else {
            this.f3129a.put(str, obj);
        }
        androidx.appcompat.app.f0.a(this.f3132d.get(str));
    }

    public y(Map map) {
        f5.h.e(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3129a = linkedHashMap;
        this.f3130b = new LinkedHashMap();
        this.f3131c = new LinkedHashMap();
        this.f3132d = new LinkedHashMap();
        this.f3133e = new a.c() { // from class: androidx.lifecycle.x
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle d6;
                d6 = y.d(y.this);
                return d6;
            }
        };
        linkedHashMap.putAll(map);
    }
}
