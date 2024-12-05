package w0;

import com.getcapacitor.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o {
    private List d(List list) {
        ArrayList arrayList = new ArrayList(list);
        if (!arrayList.contains("END")) {
            return arrayList;
        }
        int indexOf = arrayList.indexOf("END");
        int i6 = indexOf - 1;
        arrayList.set(i6, ((String) arrayList.get(i6)) + "; END");
        arrayList.remove(indexOf);
        return d(arrayList);
    }

    private String[] g(String[] strArr) {
        Object[] array = d(l(Arrays.asList(strArr))).toArray();
        return (String[]) Arrays.copyOf(array, array.length, String[].class);
    }

    private List l(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).trim());
        }
        return arrayList;
    }

    public g0 a(byte[] bArr) {
        g0 g0Var = new g0();
        for (byte b6 : bArr) {
            g0Var.put(b(b6));
        }
        return g0Var;
    }

    public int b(byte b6) {
        int parseInt = Integer.parseInt(((int) b6) + "");
        return parseInt < 0 ? parseInt + 256 : parseInt;
    }

    public byte[] c(JSONArray jSONArray) {
        byte[] bArr = new byte[jSONArray.length()];
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            bArr[i6] = (byte) (((Integer) jSONArray.get(i6)).intValue() & 255);
        }
        return bArr;
    }

    public int e(j0.b bVar) {
        Integer num = -1;
        int intValue = num.intValue();
        k5.d dVar = (k5.d) bVar.l("SELECT total_changes()", null);
        if (dVar != null && dVar.moveToFirst()) {
            intValue = Integer.parseInt(dVar.getString(0));
        }
        dVar.close();
        return intValue;
    }

    public long f(j0.b bVar) {
        k5.d dVar = (k5.d) bVar.l("SELECT last_insert_rowid()", null);
        long parseLong = dVar.moveToFirst() ? Long.parseLong(dVar.getString(0)) : -1L;
        dVar.close();
        return parseLong;
    }

    public String[] h(String str) {
        String[] g6 = g(str.replace("end;", "END;").split(";\n"));
        for (int i6 = 0; i6 < g6.length; i6++) {
            String[] split = g6[i6].split("\n");
            StringBuilder sb = new StringBuilder();
            for (String str2 : split) {
                String trim = str2.trim();
                int indexOf = trim.indexOf("--");
                if (indexOf > -1) {
                    trim = trim.substring(0, indexOf);
                }
                if (trim.length() > 0) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(trim);
                }
            }
            g6[i6] = sb.toString();
        }
        return g6[g6.length + (-1)].trim().length() == 0 ? (String[]) Arrays.copyOf(g6, g6.length - 1) : g6;
    }

    public ArrayList i(g0 g0Var) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < g0Var.length(); i6++) {
            if (g0Var.isNull(i6)) {
                obj = null;
            } else {
                obj = g0Var.get(i6);
                if (obj.getClass() == JSONObject.class) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.getString("type").equals("Buffer")) {
                        throw new JSONException("Object not implemented");
                    }
                    arrayList.add(c(jSONObject.getJSONArray("data")));
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public Boolean j(Object obj) {
        return Boolean.valueOf(obj instanceof JSONArray);
    }

    public ArrayList k(g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < g0Var.length(); i6++) {
            if (!(g0Var.get(i6) instanceof String)) {
                return new ArrayList();
            }
            arrayList.add(g0Var.getString(i6));
        }
        return arrayList;
    }
}
