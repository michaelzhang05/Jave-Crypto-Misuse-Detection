package I0;

import H0.AbstractC1176j;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f3697b = Charset.forName(C.UTF8_NAME);

    /* renamed from: a, reason: collision with root package name */
    private final M0.f f3698a;

    public d(M0.f fVar) {
        this.f3698a = fVar;
    }

    private static Map d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, j(jSONObject, next));
        }
        return hashMap;
    }

    private String e(String str) {
        return j(new JSONObject(str), "userId");
    }

    private static String f(Map map) {
        return new JSONObject(map).toString();
    }

    private static void i(File file) {
        if (file.exists() && file.delete()) {
            E0.f.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String j(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f3698a.o(str, "internal-keys");
    }

    public File b(String str) {
        return this.f3698a.o(str, "keys");
    }

    public File c(String str) {
        return this.f3698a.o(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    public Map g(String str, boolean z8) {
        File b8;
        FileInputStream fileInputStream;
        Exception e8;
        if (z8) {
            b8 = a(str);
        } else {
            b8 = b(str);
        }
        if (b8.exists()) {
            ?? length = b8.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(b8);
                        try {
                            Map d8 = d(AbstractC1176j.D(fileInputStream));
                            AbstractC1176j.e(fileInputStream, "Failed to close user metadata file.");
                            return d8;
                        } catch (Exception e9) {
                            e8 = e9;
                            E0.f.f().l("Error deserializing user metadata.", e8);
                            i(b8);
                            AbstractC1176j.e(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = length;
                        AbstractC1176j.e(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e10) {
                    fileInputStream = null;
                    e8 = e10;
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC1176j.e(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        i(b8);
        return Collections.emptyMap();
    }

    public String h(String str) {
        FileInputStream fileInputStream;
        File c8 = c(str);
        FileInputStream fileInputStream2 = null;
        if (c8.exists() && c8.length() != 0) {
            try {
                fileInputStream = new FileInputStream(c8);
                try {
                    try {
                        String e8 = e(AbstractC1176j.D(fileInputStream));
                        E0.f.f().b("Loaded userId " + e8 + " for session " + str);
                        AbstractC1176j.e(fileInputStream, "Failed to close user metadata file.");
                        return e8;
                    } catch (Exception e9) {
                        e = e9;
                        E0.f.f().l("Error deserializing user metadata.", e);
                        i(c8);
                        AbstractC1176j.e(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    AbstractC1176j.e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC1176j.e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            E0.f.f().b("No userId set for session " + str);
            i(c8);
            return null;
        }
    }

    public void k(String str, Map map, boolean z8) {
        File b8;
        String f8;
        BufferedWriter bufferedWriter;
        if (z8) {
            b8 = a(str);
        } else {
            b8 = b(str);
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                f8 = f(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b8), f3697b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e8) {
            e = e8;
        }
        try {
            bufferedWriter.write(f8);
            bufferedWriter.flush();
            AbstractC1176j.e(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e9) {
            e = e9;
            bufferedWriter2 = bufferedWriter;
            E0.f.f().l("Error serializing key/value metadata.", e);
            i(b8);
            AbstractC1176j.e(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1176j.e(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }
}
