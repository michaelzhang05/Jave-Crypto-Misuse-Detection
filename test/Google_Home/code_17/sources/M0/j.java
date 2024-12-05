package M0;

import L0.C1291a;
import L0.F;
import android.util.Base64;
import android.util.JsonReader;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a */
    private static final U0.a f6392a = new W0.d().j(C1291a.f5334a).k(true).i();

    /* loaded from: classes3.dex */
    public interface a {
        Object a(JsonReader jsonReader);
    }

    private static F.e.d.f A(JsonReader jsonReader) {
        F.e.d.f.a a8 = F.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("assignments")) {
                jsonReader.skipValue();
            } else {
                a8.b(n(jsonReader, new a() { // from class: M0.f
                    @Override // M0.j.a
                    public final Object a(JsonReader jsonReader2) {
                        F.e.d.AbstractC0097e z8;
                        z8 = j.z(jsonReader2);
                        return z8;
                    }
                }));
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static F.e.d.a.b.AbstractC0089d B(JsonReader jsonReader) {
        F.e.d.a.b.AbstractC0089d.AbstractC0090a a8 = F.e.d.a.b.AbstractC0089d.a();
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
    public static F.e.d.a.b.AbstractC0091e C(JsonReader jsonReader) {
        F.e.d.a.b.AbstractC0091e.AbstractC0092a a8 = F.e.d.a.b.AbstractC0091e.a();
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
                    a8.b(n(jsonReader, new i()));
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

    public static F.d.b D(JsonReader jsonReader) {
        F.d.b.a a8 = F.d.b.a();
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

    private static F.d E(JsonReader jsonReader) {
        F.d.a a8 = F.d.a();
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
                a8.b(n(jsonReader, new a() { // from class: M0.e
                    @Override // M0.j.a
                    public final Object a(JsonReader jsonReader2) {
                        F.d.b D8;
                        D8 = j.D(jsonReader2);
                        return D8;
                    }
                }));
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static F.e.AbstractC0098e F(JsonReader jsonReader) {
        F.e.AbstractC0098e.a a8 = F.e.AbstractC0098e.a();
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
    public static F.e.d.a.c G(JsonReader jsonReader) {
        F.e.d.a.c.AbstractC0095a a8 = F.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c8 = 3;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.d(jsonReader.nextInt());
                    break;
                case 1:
                    a8.e(jsonReader.nextString());
                    break;
                case 2:
                    a8.b(jsonReader.nextBoolean());
                    break;
                case 3:
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

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static F H(JsonReader jsonReader) {
        F.b b8 = F.b();
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
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c8 = 7;
                        break;
                    }
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c8 = '\b';
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c8 = '\t';
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c8 = '\n';
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c8 = 11;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    b8.j(E(jsonReader));
                    break;
                case 1:
                    b8.l(jsonReader.nextString());
                    break;
                case 2:
                    b8.c(jsonReader.nextString());
                    break;
                case 3:
                    b8.b(m(jsonReader));
                    break;
                case 4:
                    b8.d(jsonReader.nextString());
                    break;
                case 5:
                    b8.f(jsonReader.nextString());
                    break;
                case 6:
                    b8.h(jsonReader.nextString());
                    break;
                case 7:
                    b8.i(jsonReader.nextString());
                    break;
                case '\b':
                    b8.g(jsonReader.nextString());
                    break;
                case '\t':
                    b8.k(jsonReader.nextInt());
                    break;
                case '\n':
                    b8.e(jsonReader.nextString());
                    break;
                case 11:
                    b8.m(J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b8.a();
    }

    private static F.e.d.AbstractC0097e.b I(JsonReader jsonReader) {
        F.e.d.AbstractC0097e.b.a a8 = F.e.d.AbstractC0097e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("variantId")) {
                if (!nextName.equals("rolloutId")) {
                    jsonReader.skipValue();
                } else {
                    a8.b(jsonReader.nextString());
                }
            } else {
                a8.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    private static F.e J(JsonReader jsonReader) {
        F.e.b a8 = F.e.a();
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
                    a8.e(q(jsonReader));
                    break;
                case 5:
                    a8.g(n(jsonReader, new a() { // from class: M0.d
                        @Override // M0.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.e.d r8;
                            r8 = j.r(jsonReader2);
                            return r8;
                        }
                    }));
                    break;
                case 6:
                    a8.l(F(jsonReader));
                    break;
                case 7:
                    a8.b(l(jsonReader));
                    break;
                case '\b':
                    a8.n(K(jsonReader));
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

    private static F.e.f K(JsonReader jsonReader) {
        F.e.f.a a8 = F.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                a8.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static F.e.a l(JsonReader jsonReader) {
        F.e.a.AbstractC0083a a8 = F.e.a.a();
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
    private static F.a m(JsonReader jsonReader) {
        F.a.b a8 = F.a.a();
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
                    a8.b(n(jsonReader, new a() { // from class: M0.a
                        @Override // M0.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.a.AbstractC0081a o8;
                            o8 = j.o(jsonReader2);
                            return o8;
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

    private static List n(JsonReader jsonReader, a aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    public static F.a.AbstractC0081a o(JsonReader jsonReader) {
        F.a.AbstractC0081a.AbstractC0082a a8 = F.a.AbstractC0081a.a();
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

    public static F.c p(JsonReader jsonReader) {
        F.c.a a8 = F.c.a();
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
    private static F.e.c q(JsonReader jsonReader) {
        F.e.c.a a8 = F.e.c.a();
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
    public static F.e.d r(JsonReader jsonReader) {
        F.e.d.b a8 = F.e.d.a();
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
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(CampaignEx.JSON_KEY_TIMESTAMP)) {
                        c8 = 5;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.c(u(jsonReader));
                    break;
                case 1:
                    a8.e(A(jsonReader));
                    break;
                case 2:
                    a8.b(s(jsonReader));
                    break;
                case 3:
                    a8.d(y(jsonReader));
                    break;
                case 4:
                    a8.g(jsonReader.nextString());
                    break;
                case 5:
                    a8.f(jsonReader.nextLong());
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
    private static F.e.d.a s(JsonReader jsonReader) {
        F.e.d.a.AbstractC0084a a8 = F.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1405314732:
                    if (nextName.equals("appProcessDetails")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1332194002:
                    if (nextName.equals("background")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case 1847730860:
                    if (nextName.equals("currentProcessDetails")) {
                        c8 = 6;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    a8.b(n(jsonReader, new a() { // from class: M0.c
                        @Override // M0.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.e.d.a.c G8;
                            G8 = j.G(jsonReader2);
                            return G8;
                        }
                    }));
                    break;
                case 1:
                    a8.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 2:
                    a8.f(v(jsonReader));
                    break;
                case 3:
                    a8.g(n(jsonReader, new a() { // from class: M0.b
                        @Override // M0.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.c p8;
                            p8 = j.p(jsonReader2);
                            return p8;
                        }
                    }));
                    break;
                case 4:
                    a8.e(n(jsonReader, new a() { // from class: M0.b
                        @Override // M0.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.c p8;
                            p8 = j.p(jsonReader2);
                            return p8;
                        }
                    }));
                    break;
                case 5:
                    a8.h(jsonReader.nextInt());
                    break;
                case 6:
                    a8.d(G(jsonReader));
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
    public static F.e.d.a.b.AbstractC0085a t(JsonReader jsonReader) {
        F.e.d.a.b.AbstractC0085a.AbstractC0086a a8 = F.e.d.a.b.AbstractC0085a.a();
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
    private static F.e.d.c u(JsonReader jsonReader) {
        F.e.d.c.a a8 = F.e.d.c.a();
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
    private static F.e.d.a.b v(JsonReader jsonReader) {
        F.e.d.a.b.AbstractC0087b a8 = F.e.d.a.b.a();
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
                    a8.b(m(jsonReader));
                    break;
                case 1:
                    a8.f(n(jsonReader, new a() { // from class: M0.g
                        @Override // M0.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.e.d.a.b.AbstractC0091e C8;
                            C8 = j.C(jsonReader2);
                            return C8;
                        }
                    }));
                    break;
                case 2:
                    a8.e(B(jsonReader));
                    break;
                case 3:
                    a8.c(n(jsonReader, new a() { // from class: M0.h
                        @Override // M0.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.e.d.a.b.AbstractC0085a t8;
                            t8 = j.t(jsonReader2);
                            return t8;
                        }
                    }));
                    break;
                case 4:
                    a8.d(w(jsonReader));
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
    private static F.e.d.a.b.c w(JsonReader jsonReader) {
        F.e.d.a.b.c.AbstractC0088a a8 = F.e.d.a.b.c.a();
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
                    a8.c(n(jsonReader, new i()));
                    break;
                case 1:
                    a8.e(jsonReader.nextString());
                    break;
                case 2:
                    a8.f(jsonReader.nextString());
                    break;
                case 3:
                    a8.b(w(jsonReader));
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
    public static F.e.d.a.b.AbstractC0091e.AbstractC0093b x(JsonReader jsonReader) {
        F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a a8 = F.e.d.a.b.AbstractC0091e.AbstractC0093b.a();
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

    private static F.e.d.AbstractC0096d y(JsonReader jsonReader) {
        F.e.d.AbstractC0096d.a a8 = F.e.d.AbstractC0096d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                a8.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    public static F.e.d.AbstractC0097e z(JsonReader jsonReader) {
        F.e.d.AbstractC0097e.a a8 = F.e.d.AbstractC0097e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c8 = 65535;
            switch (nextName.hashCode()) {
                case -1536268810:
                    if (nextName.equals("parameterKey")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1027290370:
                    if (nextName.equals("templateVersion")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 1098747284:
                    if (nextName.equals("rolloutVariant")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 1124454216:
                    if (nextName.equals("parameterValue")) {
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
                    a8.e(jsonReader.nextLong());
                    break;
                case 2:
                    a8.d(I(jsonReader));
                    break;
                case 3:
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

    public F L(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                F H8 = H(jsonReader);
                jsonReader.close();
                return H8;
            } finally {
            }
        } catch (IllegalStateException e8) {
            throw new IOException(e8);
        }
    }

    public String M(F f8) {
        return f6392a.b(f8);
    }

    public F.e.d j(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                F.e.d r8 = r(jsonReader);
                jsonReader.close();
                return r8;
            } finally {
            }
        } catch (IllegalStateException e8) {
            throw new IOException(e8);
        }
    }

    public String k(F.e.d dVar) {
        return f6392a.b(dVar);
    }
}
