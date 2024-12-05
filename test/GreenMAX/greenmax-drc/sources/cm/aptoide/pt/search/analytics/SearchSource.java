package cm.aptoide.pt.search.analytics;

import cm.aptoide.pt.BuildConfig;

/* loaded from: classes.dex */
public enum SearchSource {
    WIDGET("widget"),
    SHORTCUT("shortcut"),
    DEEP_LINK("deep_link"),
    SEARCH_ICON(BuildConfig.FLAVOR_product),
    SEARCH_TOOLBAR(BuildConfig.FLAVOR_product),
    BOTTOM_NAVIGATION("vanilla_bottom_nav");

    private final String identifier;

    SearchSource(String str) {
        this.identifier = str;
    }

    public String getIdentifier() {
        return this.identifier;
    }
}
