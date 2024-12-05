package cm.aptoide.pt.themes;

import android.os.Bundle;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.pt.database.room.RoomStore;
import cm.aptoide.pt.themes.ThemeManager;
import com.facebook.GraphRequest;
import com.facebook.i;
import com.facebook.t.g;
import io.rakam.api.f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ThemeAnalytics.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rJ\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcm/aptoide/pt/themes/ThemeAnalytics;", HttpUrl.FRAGMENT_ENCODE_SET, "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "(Lcm/aptoide/analytics/AnalyticsManager;)V", "getAnalyticsManager", "()Lcm/aptoide/analytics/AnalyticsManager;", "createDarkThemeRakamSuperProperty", "Lorg/json/JSONObject;", "currentProperties", "darkThemeMode", "Lcm/aptoide/pt/themes/DarkThemeMode;", "getThemeOptionName", HttpUrl.FRAGMENT_ENCODE_SET, "themeOption", "Lcm/aptoide/pt/themes/ThemeManager$ThemeOption;", "sendDarkThemeDialogTurnItOnClickEvent", HttpUrl.FRAGMENT_ENCODE_SET, "context", "sendDarkThemeDismissClickEvent", "sendDarkThemeInteractEvent", "action", "sendThemeChangedEvent", RoomStore.THEME, "setDarkThemeUserProperty", "Companion", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThemeAnalytics {
    public static final String DARK_THEME_INTERACT_EVENT = "Dark_Theme_Interact";
    private final AnalyticsManager analyticsManager;

    /* compiled from: ThemeAnalytics.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeManager.ThemeOption.values().length];
            iArr[ThemeManager.ThemeOption.SYSTEM_DEFAULT.ordinal()] = 1;
            iArr[ThemeManager.ThemeOption.LIGHT.ordinal()] = 2;
            iArr[ThemeManager.ThemeOption.DARK.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ThemeAnalytics(AnalyticsManager analyticsManager) {
        l.f(analyticsManager, "analyticsManager");
        this.analyticsManager = analyticsManager;
    }

    private final JSONObject createDarkThemeRakamSuperProperty(JSONObject currentProperties, DarkThemeMode darkThemeMode) {
        if (currentProperties == null) {
            currentProperties = new JSONObject();
        }
        try {
            String lowerCase = darkThemeMode.name().toLowerCase();
            l.e(lowerCase, "this as java.lang.String).toLowerCase()");
            currentProperties.put(RoomStore.THEME, lowerCase);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return currentProperties;
    }

    private final String getThemeOptionName(ThemeManager.ThemeOption themeOption) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[themeOption.ordinal()];
        if (i2 == 1) {
            return "system default";
        }
        if (i2 == 2) {
            return "light theme";
        }
        if (i2 == 3) {
            return "dark theme";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void sendDarkThemeInteractEvent(String action, String context) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", action);
        this.analyticsManager.logEvent(hashMap, DARK_THEME_INTERACT_EVENT, AnalyticsManager.Action.CLICK, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDarkThemeUserProperty$lambda-0, reason: not valid java name */
    public static final void m311setDarkThemeUserProperty$lambda0(i iVar) {
    }

    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    public final void sendDarkThemeDialogTurnItOnClickEvent(String context) {
        l.f(context, "context");
        sendDarkThemeInteractEvent("turn it on", context);
    }

    public final void sendDarkThemeDismissClickEvent(String context) {
        l.f(context, "context");
        sendDarkThemeInteractEvent("dismiss", context);
    }

    public final void sendThemeChangedEvent(ThemeManager.ThemeOption theme, String context) {
        l.f(theme, RoomStore.THEME);
        l.f(context, "context");
        sendDarkThemeInteractEvent(getThemeOptionName(theme), context);
    }

    public final void setDarkThemeUserProperty(DarkThemeMode darkThemeMode) {
        l.f(darkThemeMode, "darkThemeMode");
        Bundle bundle = new Bundle();
        bundle.putBoolean("dark_theme", darkThemeMode.isDark());
        g.m(bundle, new GraphRequest.f() { // from class: cm.aptoide.pt.themes.a
            @Override // com.facebook.GraphRequest.f
            public final void b(i iVar) {
                ThemeAnalytics.m311setDarkThemeUserProperty$lambda0(iVar);
            }
        });
        io.rakam.api.g a = f.a();
        a.c0(createDarkThemeRakamSuperProperty(a.x(), darkThemeMode));
        String lowerCase = darkThemeMode.name().toLowerCase();
        l.e(lowerCase, "this as java.lang.String).toLowerCase()");
        e.f.a.a.a.e(RoomStore.THEME, lowerCase);
    }
}
