package J1;

import B1.n;
import J1.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e extends a {
    public e(b.InterfaceC0072b interfaceC0072b, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(interfaceC0072b, hashSet, jSONObject, j8);
    }

    private void e(String str) {
        E1.c e8 = E1.c.e();
        if (e8 != null) {
            for (n nVar : e8.c()) {
                if (this.f4806c.contains(nVar.v())) {
                    nVar.w().j(str, this.f4808e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // J1.b, android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(String str) {
        e(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f4807d.toString();
    }
}
