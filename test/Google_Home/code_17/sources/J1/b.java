package J1;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private a f4809a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC0072b f4810b;

    /* loaded from: classes4.dex */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: J1.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0072b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0072b interfaceC0072b) {
        this.f4810b = interfaceC0072b;
    }

    public void a(a aVar) {
        this.f4809a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f4809a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void c(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}