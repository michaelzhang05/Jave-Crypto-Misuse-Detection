package J1;

import B1.n;
import J1.b;
import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f extends a {
    public f(b.InterfaceC0072b interfaceC0072b, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(interfaceC0072b, hashSet, jSONObject, j8);
    }

    private void e(String str) {
        E1.c e8 = E1.c.e();
        if (e8 != null) {
            for (n nVar : e8.c()) {
                if (this.f4806c.contains(nVar.v())) {
                    nVar.w().p(str, this.f4808e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // J1.b, android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            e(str);
        }
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (H1.c.u(this.f4807d, this.f4810b.a())) {
            return null;
        }
        this.f4810b.a(this.f4807d);
        return this.f4807d.toString();
    }
}
