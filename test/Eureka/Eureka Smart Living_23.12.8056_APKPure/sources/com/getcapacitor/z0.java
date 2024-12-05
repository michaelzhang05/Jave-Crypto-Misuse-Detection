package com.getcapacitor;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f4502a;

    public z0(AssetManager assetManager) {
        this.f4502a = assetManager;
    }

    private JSONArray b() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f4502a.open("capacitor.plugins.json")));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        JSONArray jSONArray = new JSONArray(sb.toString());
                        bufferedReader.close();
                        return jSONArray;
                    }
                    sb.append(readLine);
                }
            } finally {
            }
        } catch (IOException unused) {
            throw new y0("Could not load capacitor.plugins.json");
        } catch (JSONException unused2) {
            throw new y0("Could not parse capacitor.plugins.json as JSON");
        }
    }

    public List a() {
        JSONArray b6 = b();
        ArrayList arrayList = new ArrayList();
        try {
            int length = b6.length();
            for (int i6 = 0; i6 < length; i6++) {
                arrayList.add(Class.forName(b6.getJSONObject(i6).getString("classpath")).asSubclass(u0.class));
            }
            return arrayList;
        } catch (ClassNotFoundException e6) {
            throw new y0("Could not find class by class path: " + e6.getMessage());
        } catch (JSONException unused) {
            throw new y0("Could not parse capacitor.plugins.json as JSON");
        }
    }
}
