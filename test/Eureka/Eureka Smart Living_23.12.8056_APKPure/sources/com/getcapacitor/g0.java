package com.getcapacitor;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class g0 extends JSONArray {
    public g0() {
    }

    public g0(Object obj) {
        super(obj);
    }

    public List a() {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < length(); i6++) {
            get(i6);
            try {
                arrayList.add(get(i6));
            } catch (Exception unused) {
                throw new JSONException("Not all items are instances of the given type");
            }
        }
        return arrayList;
    }

    public g0(String str) {
        super(str);
    }
}
