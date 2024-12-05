package K0;

import J0.AbstractC1275j;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f5000b = Charset.forName(C.UTF8_NAME);

    /* renamed from: a, reason: collision with root package name */
    private final O0.g f5001a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5002a;

        a(String str) {
            this.f5002a = str;
            put("userId", str);
        }
    }

    public f(O0.g gVar) {
        this.f5001a = gVar;
    }

    private static Map e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, o(jSONObject, next));
        }
        return hashMap;
    }

    private static List f(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            String string = jSONArray.getString(i8);
            try {
                arrayList.add(i.a(string));
            } catch (Exception e8) {
                G0.h.f().l("Failed de-serializing rollouts state. " + string, e8);
            }
        }
        return arrayList;
    }

    private String g(String str) {
        return o(new JSONObject(str), "userId");
    }

    private static String h(Map map) {
        return new JSONObject(map).toString();
    }

    private static String l(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i8 = 0; i8 < list.size(); i8++) {
            try {
                jSONArray.put(new JSONObject(i.f5028a.b(list.get(i8))));
            } catch (JSONException e8) {
                G0.h.f().l("Exception parsing rollout assignment!", e8);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            G0.h.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String n(String str) {
        return new a(str).toString();
    }

    private static String o(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f5001a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.f5001a.q(str, "keys");
    }

    public File c(String str) {
        return this.f5001a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f5001a.q(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    public Map i(String str, boolean z8) {
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
                            Map e9 = e(AbstractC1275j.A(fileInputStream));
                            AbstractC1275j.f(fileInputStream, "Failed to close user metadata file.");
                            return e9;
                        } catch (Exception e10) {
                            e8 = e10;
                            G0.h.f().l("Error deserializing user metadata.", e8);
                            m(b8);
                            AbstractC1275j.f(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = length;
                        AbstractC1275j.f(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e11) {
                    fileInputStream = null;
                    e8 = e11;
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC1275j.f(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        m(b8);
        return Collections.emptyMap();
    }

    public List j(String str) {
        FileInputStream fileInputStream;
        File c8 = c(str);
        if (c8.exists() && c8.length() != 0) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(c8);
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                List f8 = f(AbstractC1275j.A(fileInputStream));
                G0.h.f().b("Loaded rollouts state:\n" + f8 + "\nfor session " + str);
                AbstractC1275j.f(fileInputStream, "Failed to close rollouts state file.");
                return f8;
            } catch (Exception e9) {
                e = e9;
                fileInputStream2 = fileInputStream;
                G0.h.f().l("Error deserializing rollouts state.", e);
                m(c8);
                AbstractC1275j.f(fileInputStream2, "Failed to close rollouts state file.");
                return Collections.emptyList();
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                AbstractC1275j.f(fileInputStream2, "Failed to close rollouts state file.");
                throw th;
            }
        }
        m(c8);
        return Collections.emptyList();
    }

    public String k(String str) {
        FileInputStream fileInputStream;
        File d8 = d(str);
        FileInputStream fileInputStream2 = null;
        if (d8.exists() && d8.length() != 0) {
            try {
                fileInputStream = new FileInputStream(d8);
                try {
                    try {
                        String g8 = g(AbstractC1275j.A(fileInputStream));
                        G0.h.f().b("Loaded userId " + g8 + " for session " + str);
                        AbstractC1275j.f(fileInputStream, "Failed to close user metadata file.");
                        return g8;
                    } catch (Exception e8) {
                        e = e8;
                        G0.h.f().l("Error deserializing user metadata.", e);
                        m(d8);
                        AbstractC1275j.f(fileInputStream, "Failed to close user metadata file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    AbstractC1275j.f(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC1275j.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            G0.h.f().b("No userId set for session " + str);
            m(d8);
            return null;
        }
    }

    public void p(String str, Map map) {
        q(str, map, false);
    }

    public void q(String str, Map map, boolean z8) {
        File b8;
        String h8;
        BufferedWriter bufferedWriter;
        if (z8) {
            b8 = a(str);
        } else {
            b8 = b(str);
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                h8 = h(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b8), f5000b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e8) {
            e = e8;
        }
        try {
            bufferedWriter.write(h8);
            bufferedWriter.flush();
            AbstractC1275j.f(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e9) {
            e = e9;
            bufferedWriter2 = bufferedWriter;
            G0.h.f().l("Error serializing key/value metadata.", e);
            m(b8);
            AbstractC1275j.f(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1275j.f(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void r(String str, List list) {
        String l8;
        BufferedWriter bufferedWriter;
        File c8 = c(str);
        if (list.isEmpty()) {
            m(c8);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                l8 = l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c8), f5000b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e8) {
            e = e8;
        }
        try {
            bufferedWriter.write(l8);
            bufferedWriter.flush();
            AbstractC1275j.f(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e9) {
            e = e9;
            bufferedWriter2 = bufferedWriter;
            G0.h.f().l("Error serializing rollouts state.", e);
            m(c8);
            AbstractC1275j.f(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1275j.f(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void s(String str, String str2) {
        String n8;
        BufferedWriter bufferedWriter;
        File d8 = d(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                n8 = n(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d8), f5000b));
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(n8);
            bufferedWriter.flush();
            AbstractC1275j.f(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e9) {
            e = e9;
            bufferedWriter2 = bufferedWriter;
            G0.h.f().l("Error serializing user metadata.", e);
            AbstractC1275j.f(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1275j.f(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
