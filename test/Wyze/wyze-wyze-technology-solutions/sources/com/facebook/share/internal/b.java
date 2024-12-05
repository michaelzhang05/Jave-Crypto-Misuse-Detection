package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.internal.x;
import com.facebook.j;
import com.facebook.share.internal.a;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import java.io.File;
import java.io.FileNotFoundException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ShareInternalUtility.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: ShareInternalUtility.java */
    /* loaded from: classes.dex */
    static class a implements a.InterfaceC0137a {
        a() {
        }

        @Override // com.facebook.share.internal.a.InterfaceC0137a
        public JSONObject a(SharePhoto sharePhoto) {
            Uri a = sharePhoto.a();
            if (x.S(a)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", a.toString());
                    return jSONObject;
                } catch (JSONException e2) {
                    throw new FacebookException("Unable to attach images", e2);
                }
            }
            throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
        }
    }

    public static Pair<String, String> a(String str) {
        String str2;
        int i2;
        int indexOf = str.indexOf(58);
        if (indexOf == -1 || str.length() <= (i2 = indexOf + 1)) {
            str2 = null;
        } else {
            str2 = str.substring(0, indexOf);
            str = str.substring(i2);
        }
        return new Pair<>(str2, str);
    }

    public static GraphRequest b(AccessToken accessToken, Uri uri, GraphRequest.f fVar) throws FileNotFoundException {
        if (x.P(uri)) {
            return c(accessToken, new File(uri.getPath()), fVar);
        }
        if (x.M(uri)) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, j.POST, fVar);
        }
        throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
    }

    public static GraphRequest c(AccessToken accessToken, File file, GraphRequest.f fVar) throws FileNotFoundException {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, j.POST, fVar);
    }

    public static JSONArray d(JSONArray jSONArray, boolean z) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONArray) {
                obj = d((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = e((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    public static JSONObject e(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i2 = 0; i2 < names.length(); i2++) {
                String string = names.getString(i2);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = e((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = d((JSONArray) obj, true);
                }
                Pair<String, String> a2 = a(string);
                String str = (String) a2.first;
                String str2 = (String) a2.second;
                if (z) {
                    if (str != null && str.equals("fbsdk")) {
                        jSONObject2.put(string, obj);
                    } else {
                        if (str != null && !str.equals("og")) {
                            jSONObject3.put(str2, obj);
                        }
                        jSONObject2.put(str2, obj);
                    }
                } else if (str != null && str.equals("fb")) {
                    jSONObject2.put(string, obj);
                } else {
                    jSONObject2.put(str2, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new FacebookException("Failed to create json object from share content");
        }
    }

    public static JSONObject f(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        return com.facebook.share.internal.a.b(shareOpenGraphContent.d(), new a());
    }
}
