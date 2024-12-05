package Q0;

import J0.AbstractC1275j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final File f9089a;

    public a(O0.g gVar) {
        this.f9089a = gVar.g("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f9089a;
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        G0.h.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a8 = a();
                if (a8.exists()) {
                    fileInputStream = new FileInputStream(a8);
                    try {
                        jSONObject = new JSONObject(AbstractC1275j.A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e8) {
                        e = e8;
                        G0.h.f().e("Failed to fetch cached settings", e);
                        AbstractC1275j.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    G0.h.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC1275j.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                AbstractC1275j.f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            AbstractC1275j.f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j8, JSONObject jSONObject) {
        FileWriter fileWriter;
        G0.h.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j8);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e8) {
                e = e8;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                AbstractC1275j.f(fileWriter, "Failed to close settings writer.");
            } catch (Exception e9) {
                e = e9;
                fileWriter2 = fileWriter;
                G0.h.f().e("Failed to cache settings", e);
                AbstractC1275j.f(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                AbstractC1275j.f(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
