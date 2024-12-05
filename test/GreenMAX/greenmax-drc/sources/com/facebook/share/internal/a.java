package com.facebook.share.internal;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OpenGraphJSONUtility.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: OpenGraphJSONUtility.java */
    /* renamed from: com.facebook.share.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0137a {
        JSONObject a(SharePhoto sharePhoto);
    }

    private static JSONArray a(List list, InterfaceC0137a interfaceC0137a) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(d(it.next(), interfaceC0137a));
        }
        return jSONArray;
    }

    public static JSONObject b(ShareOpenGraphAction shareOpenGraphAction, InterfaceC0137a interfaceC0137a) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphAction.d()) {
            jSONObject.put(str, d(shareOpenGraphAction.a(str), interfaceC0137a));
        }
        return jSONObject;
    }

    private static JSONObject c(ShareOpenGraphObject shareOpenGraphObject, InterfaceC0137a interfaceC0137a) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphObject.d()) {
            jSONObject.put(str, d(shareOpenGraphObject.a(str), interfaceC0137a));
        }
        return jSONObject;
    }

    public static Object d(Object obj, InterfaceC0137a interfaceC0137a) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            if (interfaceC0137a != null) {
                return interfaceC0137a.a((SharePhoto) obj);
            }
            return null;
        }
        if (obj instanceof ShareOpenGraphObject) {
            return c((ShareOpenGraphObject) obj, interfaceC0137a);
        }
        if (obj instanceof List) {
            return a((List) obj, interfaceC0137a);
        }
        throw new IllegalArgumentException("Invalid object found for JSON serialization: " + obj.toString());
    }
}
