package K0;

import J0.B;
import J0.C;
import J0.C1189a;
import android.util.Base64;
import android.util.JsonReader;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a */
    private static final S0.a f5716a = new U0.d().j(C1189a.f4338a).k(true).i();

    /* loaded from: classes3.dex */
    public interface a {
        Object a(JsonReader jsonReader);
    }

    private static B.d A(JsonReader jsonReader) {
        B.d.a a8 = B.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("files")) {
                if (!nextName.equals("orgId")) {
                    jsonReader.skipValue();
                } else {
                    a8.c(jsonReader.nextString());
                }
            } else {
                a8.b(l(jsonReader, new a() { // from class: K0.d
                    @Override // K0.h.a
                    public final Object a(JsonReader jsonReader2) {
                        B.d.b z8;
                        z8 = h.z(jsonReader2);
                        return z8;
                    }
                }));
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static B.e.AbstractC0087e B(JsonReader jsonReader) {
        B.e.AbstractC0087e.a a8 = B.e.AbstractC0087e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c8 = 3;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.b(jsonReader.nextString());
                    break;
                case 1:
                    a8.c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a8.e(jsonReader.nextString());
                    break;
                case 3:
                    a8.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static B C(JsonReader jsonReader) {
        B.b b8 = B.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c8 = 7;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c8 = '\b';
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    b8.h(A(jsonReader));
                    break;
                case 1:
                    b8.j(jsonReader.nextString());
                    break;
                case 2:
                    b8.b(k(jsonReader));
                    break;
                case 3:
                    b8.c(jsonReader.nextString());
                    break;
                case 4:
                    b8.f(jsonReader.nextString());
                    break;
                case 5:
                    b8.g(jsonReader.nextString());
                    break;
                case 6:
                    b8.i(jsonReader.nextInt());
                    break;
                case 7:
                    b8.d(jsonReader.nextString());
                    break;
                case '\b':
                    b8.k(D(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    private static B.e D(JsonReader jsonReader) {
        B.e.b a8 = B.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                        c8 = 7;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c8 = '\b';
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c8 = '\t';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c8 = '\n';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c8 = 11;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.m(jsonReader.nextLong());
                    break;
                case 1:
                    a8.c(jsonReader.nextString());
                    break;
                case 2:
                    a8.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a8.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    a8.e(o(jsonReader));
                    break;
                case 5:
                    a8.g(l(jsonReader, new a() { // from class: K0.c
                        @Override // K0.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.e.d p8;
                            p8 = h.p(jsonReader2);
                            return p8;
                        }
                    }));
                    break;
                case 6:
                    a8.l(B(jsonReader));
                    break;
                case 7:
                    a8.b(j(jsonReader));
                    break;
                case '\b':
                    a8.n(E(jsonReader));
                    break;
                case '\t':
                    a8.h(jsonReader.nextString());
                    break;
                case '\n':
                    a8.d(jsonReader.nextBoolean());
                    break;
                case 11:
                    a8.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static B.e.f E(JsonReader jsonReader) {
        B.e.f.a a8 = B.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a8.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static B.e.a j(JsonReader jsonReader) {
        B.e.a.AbstractC0074a a8 = B.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c8 = 5;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.e(jsonReader.nextString());
                    break;
                case 1:
                    a8.b(jsonReader.nextString());
                    break;
                case 2:
                    a8.c(jsonReader.nextString());
                    break;
                case 3:
                    a8.g(jsonReader.nextString());
                    break;
                case 4:
                    a8.f(jsonReader.nextString());
                    break;
                case 5:
                    a8.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static B.a k(JsonReader jsonReader) {
        B.a.b a8 = B.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(CampaignEx.JSON_KEY_TIMESTAMP)) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c8 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c8 = '\b';
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.b(l(jsonReader, new a() { // from class: K0.a
                        @Override // K0.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.a.AbstractC0072a m8;
                            m8 = h.m(jsonReader2);
                            return m8;
                        }
                    }));
                    break;
                case 1:
                    a8.d(jsonReader.nextInt());
                    break;
                case 2:
                    a8.f(jsonReader.nextLong());
                    break;
                case 3:
                    a8.h(jsonReader.nextLong());
                    break;
                case 4:
                    a8.i(jsonReader.nextLong());
                    break;
                case 5:
                    a8.e(jsonReader.nextString());
                    break;
                case 6:
                    a8.g(jsonReader.nextInt());
                    break;
                case 7:
                    a8.j(jsonReader.nextString());
                    break;
                case '\b':
                    a8.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static C l(JsonReader jsonReader, a aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return C.a(arrayList);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    public static B.a.AbstractC0072a m(JsonReader jsonReader) {
        B.a.AbstractC0072a.AbstractC0073a a8 = B.a.AbstractC0072a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals("buildId")) {
                        c8 = 2;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.d(jsonReader.nextString());
                    break;
                case 1:
                    a8.b(jsonReader.nextString());
                    break;
                case 2:
                    a8.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.c n(JsonReader jsonReader) {
        B.c.a a8 = B.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals(LeanbackPreferenceDialogFragment.ARG_KEY)) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    a8.c(jsonReader.nextString());
                }
            } else {
                a8.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static B.e.c o(JsonReader jsonReader) {
        B.e.c.a a8 = B.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c8 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c8 = '\b';
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a8.e(jsonReader.nextString());
                    break;
                case 2:
                    a8.h(jsonReader.nextLong());
                    break;
                case 3:
                    a8.b(jsonReader.nextInt());
                    break;
                case 4:
                    a8.d(jsonReader.nextLong());
                    break;
                case 5:
                    a8.c(jsonReader.nextInt());
                    break;
                case 6:
                    a8.f(jsonReader.nextString());
                    break;
                case 7:
                    a8.j(jsonReader.nextInt());
                    break;
                case '\b':
                    a8.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    public static B.e.d p(JsonReader jsonReader) {
        B.e.d.b a8 = B.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(CampaignEx.JSON_KEY_TIMESTAMP)) {
                        c8 = 4;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.c(s(jsonReader));
                    break;
                case 1:
                    a8.b(q(jsonReader));
                    break;
                case 2:
                    a8.d(w(jsonReader));
                    break;
                case 3:
                    a8.f(jsonReader.nextString());
                    break;
                case 4:
                    a8.e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static B.e.d.a q(JsonReader jsonReader) {
        B.e.d.a.AbstractC0075a a8 = B.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c8 = 4;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a8.d(t(jsonReader));
                    break;
                case 2:
                    a8.e(l(jsonReader, new a() { // from class: K0.b
                        @Override // K0.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.c n8;
                            n8 = h.n(jsonReader2);
                            return n8;
                        }
                    }));
                    break;
                case 3:
                    a8.c(l(jsonReader, new a() { // from class: K0.b
                        @Override // K0.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.c n8;
                            n8 = h.n(jsonReader2);
                            return n8;
                        }
                    }));
                    break;
                case 4:
                    a8.f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    public static B.e.d.a.b.AbstractC0076a r(JsonReader jsonReader) {
        B.e.d.a.b.AbstractC0076a.AbstractC0077a a8 = B.e.d.a.b.AbstractC0076a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c8 = 3;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.c(jsonReader.nextString());
                    break;
                case 1:
                    a8.d(jsonReader.nextLong());
                    break;
                case 2:
                    a8.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a8.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static B.e.d.c s(JsonReader jsonReader) {
        B.e.d.c.a a8 = B.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c8 = 5;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a8.c(jsonReader.nextInt());
                    break;
                case 2:
                    a8.e(jsonReader.nextInt());
                    break;
                case 3:
                    a8.d(jsonReader.nextLong());
                    break;
                case 4:
                    a8.g(jsonReader.nextLong());
                    break;
                case 5:
                    a8.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static B.e.d.a.b t(JsonReader jsonReader) {
        B.e.d.a.b.AbstractC0078b a8 = B.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c8 = 4;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.b(k(jsonReader));
                    break;
                case 1:
                    a8.f(l(jsonReader, new a() { // from class: K0.e
                        @Override // K0.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.e.d.a.b.AbstractC0082e y8;
                            y8 = h.y(jsonReader2);
                            return y8;
                        }
                    }));
                    break;
                case 2:
                    a8.e(x(jsonReader));
                    break;
                case 3:
                    a8.c(l(jsonReader, new a() { // from class: K0.f
                        @Override // K0.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.e.d.a.b.AbstractC0076a r8;
                            r8 = h.r(jsonReader2);
                            return r8;
                        }
                    }));
                    break;
                case 4:
                    a8.d(u(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static B.e.d.a.b.c u(JsonReader jsonReader) {
        B.e.d.a.b.c.AbstractC0079a a8 = B.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS)) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c8 = 4;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.c(l(jsonReader, new g()));
                    break;
                case 1:
                    a8.e(jsonReader.nextString());
                    break;
                case 2:
                    a8.f(jsonReader.nextString());
                    break;
                case 3:
                    a8.b(u(jsonReader));
                    break;
                case 4:
                    a8.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    public static B.e.d.a.b.AbstractC0082e.AbstractC0084b v(JsonReader jsonReader) {
        B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a a8 = B.e.d.a.b.AbstractC0082e.AbstractC0084b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c8 = 4;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.d(jsonReader.nextLong());
                    break;
                case 1:
                    a8.f(jsonReader.nextString());
                    break;
                case 2:
                    a8.e(jsonReader.nextLong());
                    break;
                case 3:
                    a8.b(jsonReader.nextString());
                    break;
                case 4:
                    a8.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static B.e.d.AbstractC0086d w(JsonReader jsonReader) {
        B.e.d.AbstractC0086d.a a8 = B.e.d.AbstractC0086d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                a8.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static B.e.d.a.b.AbstractC0080d x(JsonReader jsonReader) {
        B.e.d.a.b.AbstractC0080d.AbstractC0081a a8 = B.e.d.a.b.AbstractC0080d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c8 = 2;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.b(jsonReader.nextLong());
                    break;
                case 1:
                    a8.c(jsonReader.nextString());
                    break;
                case 2:
                    a8.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    public static B.e.d.a.b.AbstractC0082e y(JsonReader jsonReader) {
        B.e.d.a.b.AbstractC0082e.AbstractC0083a a8 = B.e.d.a.b.AbstractC0082e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS)) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c8 = 2;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.b(l(jsonReader, new g()));
                    break;
                case 1:
                    a8.d(jsonReader.nextString());
                    break;
                case 2:
                    a8.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.d.b z(JsonReader jsonReader) {
        B.d.b.a a8 = B.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("filename")) {
                if (!nextName.equals("contents")) {
                    jsonReader.skipValue();
                } else {
                    a8.b(Base64.decode(jsonReader.nextString(), 2));
                }
            } else {
                a8.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    public B F(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                B C8 = C(jsonReader);
                jsonReader.close();
                return C8;
            } finally {
            }
        } catch (IllegalStateException e8) {
            throw new IOException(e8);
        }
    }

    public String G(B b8) {
        return f5716a.b(b8);
    }

    public B.e.d h(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                B.e.d p8 = p(jsonReader);
                jsonReader.close();
                return p8;
            } finally {
            }
        } catch (IllegalStateException e8) {
            throw new IOException(e8);
        }
    }

    public String i(B.e.d dVar) {
        return f5716a.b(dVar);
    }
}
