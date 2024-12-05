package com.facebook;

import android.util.Log;
import com.facebook.internal.x;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: GraphResponse.java */
/* loaded from: classes.dex */
public class i {
    private static final String a = "i";

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f9095b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f9096c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONArray f9097d;

    /* renamed from: e, reason: collision with root package name */
    private final FacebookRequestError f9098e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9099f;

    /* renamed from: g, reason: collision with root package name */
    private final GraphRequest f9100g;

    public i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<i> a(List<GraphRequest> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new i(list.get(i2), httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
        }
        return arrayList;
    }

    private static i b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError a2 = FacebookRequestError.a(jSONObject, obj2, httpURLConnection);
            if (a2 != null) {
                Log.e(a, a2.toString());
                if (a2.c() == 190 && x.N(graphRequest.q())) {
                    if (a2.h() != 493) {
                        AccessToken.v(null);
                    } else if (!AccessToken.g().u()) {
                        AccessToken.e();
                    }
                }
                return new i(graphRequest, httpURLConnection, a2);
            }
            Object D = x.D(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (D instanceof JSONObject) {
                return new i(graphRequest, httpURLConnection, D.toString(), (JSONObject) D);
            }
            if (D instanceof JSONArray) {
                return new i(graphRequest, httpURLConnection, D.toString(), (JSONArray) D);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new i(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        throw new FacebookException("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.facebook.i> c(java.net.HttpURLConnection r7, java.util.List<com.facebook.GraphRequest> r8, java.lang.Object r9) throws com.facebook.FacebookException, org.json.JSONException {
        /*
            int r0 = r8.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L51
            java.lang.Object r3 = r8.get(r2)
            com.facebook.GraphRequest r3 = (com.facebook.GraphRequest) r3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
            r4.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
            java.lang.String r5 = "body"
            r4.put(r5, r9)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
            if (r7 == 0) goto L24
            int r5 = r7.getResponseCode()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
            goto L26
        L24:
            r5 = 200(0xc8, float:2.8E-43)
        L26:
            java.lang.String r6 = "code"
            r4.put(r6, r5)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
            r5.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
            r5.put(r4)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
            goto L52
        L34:
            r4 = move-exception
            com.facebook.i r5 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r4)
            r5.<init>(r3, r7, r6)
            r1.add(r5)
            goto L51
        L43:
            r4 = move-exception
            com.facebook.i r5 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r4)
            r5.<init>(r3, r7, r6)
            r1.add(r5)
        L51:
            r5 = r9
        L52:
            boolean r3 = r5 instanceof org.json.JSONArray
            if (r3 == 0) goto L97
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r3 = r5.length()
            if (r3 != r0) goto L97
        L5e:
            int r0 = r5.length()
            if (r2 >= r0) goto L96
            java.lang.Object r0 = r8.get(r2)
            com.facebook.GraphRequest r0 = (com.facebook.GraphRequest) r0
            java.lang.Object r3 = r5.get(r2)     // Catch: com.facebook.FacebookException -> L76 org.json.JSONException -> L85
            com.facebook.i r3 = b(r0, r7, r3, r9)     // Catch: com.facebook.FacebookException -> L76 org.json.JSONException -> L85
            r1.add(r3)     // Catch: com.facebook.FacebookException -> L76 org.json.JSONException -> L85
            goto L93
        L76:
            r3 = move-exception
            com.facebook.i r4 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r3)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
            goto L93
        L85:
            r3 = move-exception
            com.facebook.i r4 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r3)
            r4.<init>(r0, r7, r6)
            r1.add(r4)
        L93:
            int r2 = r2 + 1
            goto L5e
        L96:
            return r1
        L97:
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r8 = "Unexpected number of results"
            r7.<init>(r8)
            goto La0
        L9f:
            throw r7
        La0:
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.i.c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    static List<i> d(InputStream inputStream, HttpURLConnection httpURLConnection, h hVar) throws FacebookException, JSONException, IOException {
        String e0 = x.e0(inputStream);
        com.facebook.internal.r.h(l.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(e0.length()), e0);
        return e(e0, httpURLConnection, hVar);
    }

    static List<i> e(String str, HttpURLConnection httpURLConnection, h hVar) throws FacebookException, JSONException, IOException {
        List<i> c2 = c(httpURLConnection, hVar, new JSONTokener(str).nextValue());
        com.facebook.internal.r.h(l.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", hVar.M(), Integer.valueOf(str.length()), c2);
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<i> f(HttpURLConnection httpURLConnection, h hVar) {
        InputStream inputStream;
        try {
            try {
                if (f.v()) {
                    if (httpURLConnection.getResponseCode() >= 400) {
                        inputStream = httpURLConnection.getErrorStream();
                    } else {
                        inputStream = httpURLConnection.getInputStream();
                    }
                    List<i> d2 = d(inputStream, httpURLConnection, hVar);
                    x.h(inputStream);
                    return d2;
                }
                Log.e(a, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
            } catch (FacebookException e2) {
                com.facebook.internal.r.h(l.REQUESTS, "Response", "Response <Error>: %s", e2);
                List<i> a2 = a(hVar, httpURLConnection, e2);
                x.h(null);
                return a2;
            } catch (Exception e3) {
                com.facebook.internal.r.h(l.REQUESTS, "Response", "Response <Error>: %s", e3);
                List<i> a3 = a(hVar, httpURLConnection, new FacebookException(e3));
                x.h(null);
                return a3;
            }
        } catch (Throwable th) {
            x.h(null);
            throw th;
        }
    }

    public final FacebookRequestError g() {
        return this.f9098e;
    }

    public final JSONObject h() {
        return this.f9096c;
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f9095b;
            objArr[0] = Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
            str = String.format(locale, "%d", objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        return "{Response:  responseCode: " + str + ", graphObject: " + this.f9096c + ", error: " + this.f9098e + "}";
    }

    public i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    public i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }

    i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f9100g = graphRequest;
        this.f9095b = httpURLConnection;
        this.f9099f = str;
        this.f9096c = jSONObject;
        this.f9097d = jSONArray;
        this.f9098e = facebookRequestError;
    }
}
