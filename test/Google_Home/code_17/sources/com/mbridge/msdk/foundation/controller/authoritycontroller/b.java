package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.OnCompletionListener;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f20129c = true;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f20130d = true;

    /* renamed from: b, reason: collision with root package name */
    protected AuthorityInfoBean f20132b;

    /* renamed from: g, reason: collision with root package name */
    private e f20135g;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f20131a = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private int f20133e = 3;

    /* renamed from: f, reason: collision with root package name */
    private String f20134f = "";

    /* JADX INFO: Access modifiers changed from: protected */
    public b() {
        c();
    }

    public static boolean b() {
        return f20130d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int i8;
        boolean b8 = this.f20135g.b();
        c(this.f20135g.a());
        if (b8) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c(i8);
        this.f20132b.authDeviceIdStatus(b8 ? 1 : 0);
    }

    protected abstract int b(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.f20132b = new AuthorityInfoBean();
        try {
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
                this.f20132b.authGenDataStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
                this.f20132b.authDeviceIdStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
                this.f20132b.authSerialIdStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_OTHER).equals("")) {
                this.f20132b.authOther(1);
            }
            this.f20131a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f20131a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f20131a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f20131a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final AuthorityInfoBean d() {
        AuthorityInfoBean authorityInfoBean = this.f20132b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.a(1);
        return authorityInfoBean2;
    }

    public final boolean e() {
        int i8 = this.f20133e;
        if (i8 == 1 || i8 == 3) {
            return true;
        }
        return false;
    }

    public final int f() {
        return com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_COPPA, 0);
    }

    public final int g() {
        return this.f20133e;
    }

    public final String h() {
        JSONArray jSONArray = new JSONArray();
        for (int i8 = 0; i8 < this.f20131a.size(); i8++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f20131a.get(i8)));
                jSONObject.put("client_status", a(this.f20131a.get(i8)));
                jSONObject.put("server_status", b(this.f20131a.get(i8)));
                jSONArray.put(jSONObject);
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public final String i() {
        return this.f20134f;
    }

    public static void b(boolean z8) {
        f20130d = z8;
    }

    public static boolean a() {
        return f20129c;
    }

    public final void b(int i8) {
        com.mbridge.msdk.foundation.a.a.a.a().b(MBridgeConstans.AUTHORITY_DNT, i8);
    }

    public static void a(boolean z8) {
        f20129c = z8;
    }

    public final void a(int i8) {
        if (this.f20132b != null) {
            c(i8);
        }
    }

    public final void a(final Context context, final OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.authoritycontroller.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(context);
                    onCompletionListener.onCompletion();
                }
            });
        } else {
            a(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String a8 = com.mbridge.msdk.foundation.a.a.a.a().a(str);
                if (TextUtils.isEmpty(a8)) {
                    return 0;
                }
                return Integer.parseInt(a8);
            }
        } catch (Exception e8) {
            ad.b("SDKAuthorityController", e8.getMessage());
        }
        return 0;
    }

    public final void a(String str, int i8) {
        if (this.f20132b != null) {
            if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                this.f20132b.authGenDataStatus(i8);
                return;
            }
            if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                this.f20132b.authDeviceIdStatus(i8);
                return;
            }
            if (str.equals(MBridgeConstans.AUTHORITY_ALL_INFO)) {
                this.f20132b.a(i8);
            } else if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
                this.f20132b.authSerialIdStatus(i8);
            } else if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
                this.f20132b.authOther(i8);
            }
        }
    }

    private void c(int i8) {
        this.f20133e = i8 != 1 ? 2 : 1;
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f20134f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            if (this.f20135g == null) {
                e eVar = new e(context);
                this.f20135g = eVar;
                eVar.a(new e.a() { // from class: com.mbridge.msdk.foundation.controller.authoritycontroller.b.2
                    @Override // com.mbridge.msdk.foundation.controller.e.a
                    public final void a() {
                        b.this.j();
                    }
                });
            }
            j();
        } catch (Throwable th) {
            ad.b("SDKAuthorityController", th.getMessage());
        }
    }
}
