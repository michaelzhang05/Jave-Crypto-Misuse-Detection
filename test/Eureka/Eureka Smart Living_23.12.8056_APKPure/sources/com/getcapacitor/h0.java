package com.getcapacitor;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.cordova.networkinformation.NetworkManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static String f4422a = "_options";

    /* renamed from: b, reason: collision with root package name */
    private static String f4423b = "_callback";

    private static JSONObject a(x0 x0Var) {
        JSONObject jSONObject = new JSONObject();
        Collection d6 = x0Var.d();
        try {
            String a6 = x0Var.a();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("name", a6);
            Iterator it = d6.iterator();
            while (it.hasNext()) {
                jSONArray.put(b((b1) it.next()));
            }
            jSONObject.put("methods", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static JSONObject b(b1 b1Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", b1Var.b());
            if (!b1Var.c().equals(NetworkManager.TYPE_NONE)) {
                jSONObject.put("rtype", b1Var.c());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static String c(x0 x0Var, b1 b1Var) {
        String str;
        StringBuilder sb;
        String str2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(f4422a);
        String c6 = b1Var.c();
        if (c6.equals("callback")) {
            arrayList2.add(f4423b);
        }
        arrayList.add("t['" + b1Var.b() + "'] = function(" + TextUtils.join(", ", arrayList2) + ") {");
        char c7 = 65535;
        switch (c6.hashCode()) {
            case -309216997:
                if (c6.equals("promise")) {
                    c7 = 0;
                    break;
                }
                break;
            case -172220347:
                if (c6.equals("callback")) {
                    c7 = 1;
                    break;
                }
                break;
            case 3387192:
                if (c6.equals(NetworkManager.TYPE_NONE)) {
                    c7 = 2;
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                str = "return w.Capacitor.nativePromise('" + x0Var.a() + "', '" + b1Var.b() + "', " + f4422a + ")";
                break;
            case 1:
                sb = new StringBuilder();
                sb.append("return w.Capacitor.nativeCallback('");
                sb.append(x0Var.a());
                sb.append("', '");
                sb.append(b1Var.b());
                sb.append("', ");
                sb.append(f4422a);
                sb.append(", ");
                str2 = f4423b;
                sb.append(str2);
                sb.append(")");
                str = sb.toString();
                break;
            case 2:
                sb = new StringBuilder();
                sb.append("return w.Capacitor.nativeCallback('");
                sb.append(x0Var.a());
                sb.append("', '");
                sb.append(b1Var.b());
                sb.append("', ");
                str2 = f4422a;
                sb.append(str2);
                sb.append(")");
                str = sb.toString();
                break;
        }
        arrayList.add(str);
        arrayList.add("}");
        return TextUtils.join("\n", arrayList);
    }

    public static String d(Context context) {
        return h(context, "native-bridge.js");
    }

    public static String e(Context context) {
        try {
            return d0.k(context.getAssets(), "public/cordova.js");
        } catch (IOException unused) {
            l0.c("Unable to read public/cordova.js file, Cordova plugins will not work");
            return "";
        }
    }

    public static String f(Context context) {
        return h(context, "public/plugins");
    }

    public static String g(Context context) {
        try {
            return d0.k(context.getAssets(), "public/cordova_plugins.js");
        } catch (IOException unused) {
            l0.c("Unable to read public/cordova_plugins.js file, Cordova plugins will not work");
            return "";
        }
    }

    public static String h(Context context, String str) {
        String[] list;
        StringBuilder sb = new StringBuilder();
        try {
            list = context.getAssets().list(str);
        } catch (IOException unused) {
            l0.n("Unable to read file at path " + str);
        }
        if (list.length <= 0) {
            return d0.k(context.getAssets(), str);
        }
        for (String str2 : list) {
            if (!str2.endsWith(".map")) {
                sb.append(h(context, str + "/" + str2));
            }
        }
        return sb.toString();
    }

    public static String i(Context context, boolean z5, boolean z6) {
        return "window.Capacitor = { DEBUG: " + z6 + ", isLoggingEnabled: " + z5 + ", Plugins: {} };";
    }

    public static String j(Collection collection) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        arrayList.add("// Begin: Capacitor Plugin JS");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            x0 x0Var = (x0) it.next();
            arrayList.add("(function(w) {\nvar a = (w.Capacitor = w.Capacitor || {});\nvar p = (a.Plugins = a.Plugins || {});\nvar t = (p['" + x0Var.a() + "'] = {});\nt.addListener = function(eventName, callback) {\n  return w.Capacitor.addListener('" + x0Var.a() + "', eventName, callback);\n}");
            for (b1 b1Var : x0Var.d()) {
                if (!b1Var.b().equals("addListener") && !b1Var.b().equals("removeListener")) {
                    arrayList.add(c(x0Var, b1Var));
                }
            }
            arrayList.add("})(window);\n");
            jSONArray.put(a(x0Var));
        }
        return TextUtils.join("\n", arrayList) + "\nwindow.Capacitor.PluginHeaders = " + jSONArray.toString() + ";";
    }
}
