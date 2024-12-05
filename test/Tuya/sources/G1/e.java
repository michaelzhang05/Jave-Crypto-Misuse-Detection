package G1;

import G1.b;
import java.util.HashSet;
import org.json.JSONObject;
import y1.C3981n;

/* loaded from: classes3.dex */
public class e extends a {
    public e(b.InterfaceC0046b interfaceC0046b, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(interfaceC0046b, hashSet, jSONObject, j8);
    }

    private void e(String str) {
        B1.c e8 = B1.c.e();
        if (e8 != null) {
            for (C3981n c3981n : e8.c()) {
                if (this.f3087c.contains(c3981n.v())) {
                    c3981n.w().e(str, this.f3089e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // G1.b, android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(String str) {
        e(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f3088d.toString();
    }
}
