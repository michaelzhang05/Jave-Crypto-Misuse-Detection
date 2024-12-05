package w0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9744a = "w0.q";

    private void a(c cVar, String[] strArr) {
        cVar.c();
        try {
            try {
                cVar.j(strArr, Boolean.FALSE);
                cVar.e();
            } catch (Exception e6) {
                throw new Exception("Error: executeStatementsProcess  failed " + e6);
            }
        } finally {
            cVar.G();
        }
    }

    public void b(c cVar, Dictionary dictionary, Integer num, Integer num2) {
        Log.i(f9744a, "UtilsUpgrade.onUpgrade: from " + num + " to " + num2);
        ArrayList<Integer> list = Collections.list(dictionary.keys());
        Collections.sort(list);
        for (Integer num3 : list) {
            if (num3.intValue() > num.intValue() && num3.intValue() <= num2.intValue()) {
                Log.i(f9744a, "- UtilsUpgrade.onUpgrade toVersion: " + num3);
                JSONObject jSONObject = (JSONObject) dictionary.get(num3);
                JSONArray jSONArray = jSONObject.has("statements") ? jSONObject.getJSONArray("statements") : new JSONArray();
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    arrayList.add(jSONArray.getString(i6));
                }
                if (arrayList.size() == 0) {
                    throw new Exception("Error: onUpgrade statement not given");
                }
                try {
                    a(cVar, (String[]) arrayList.toArray(new String[0]));
                    cVar.n().n(num3.intValue());
                } catch (Exception e6) {
                    throw new Exception("Error: onUpgrade executeStatementProcess failed " + e6);
                }
            }
        }
    }
}
