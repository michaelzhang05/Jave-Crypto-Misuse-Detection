package c;

import a5.d0;
import a5.e0;
import a5.j;
import a5.v;
import android.content.Context;
import android.content.Intent;
import c.a;
import f5.f;
import f5.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import z4.g;
import z4.i;

/* loaded from: classes.dex */
public final class b extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3838a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            h.e(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            h.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // c.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        h.e(context, "context");
        h.e(strArr, "input");
        return f3838a.a(strArr);
    }

    @Override // c.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a.C0067a b(Context context, String[] strArr) {
        int a6;
        int a7;
        Map d6;
        h.e(context, "context");
        h.e(strArr, "input");
        boolean z5 = true;
        if (strArr.length == 0) {
            d6 = e0.d();
            return new a.C0067a(d6);
        }
        int length = strArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            if (!(androidx.core.content.a.a(context, strArr[i6]) == 0)) {
                z5 = false;
                break;
            }
            i6++;
        }
        if (!z5) {
            return null;
        }
        a6 = d0.a(strArr.length);
        a7 = g5.f.a(a6, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
        for (String str : strArr) {
            g a8 = i.a(str, Boolean.TRUE);
            linkedHashMap.put(a8.c(), a8.d());
        }
        return new a.C0067a(linkedHashMap);
    }

    @Override // c.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i6, Intent intent) {
        Map d6;
        List g6;
        List k6;
        Map g7;
        Map d7;
        Map d8;
        if (i6 != -1) {
            d8 = e0.d();
            return d8;
        }
        if (intent == null) {
            d7 = e0.d();
            return d7;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            d6 = e0.d();
            return d6;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i7 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i7 == 0));
        }
        g6 = j.g(stringArrayExtra);
        k6 = v.k(g6, arrayList);
        g7 = e0.g(k6);
        return g7;
    }
}
