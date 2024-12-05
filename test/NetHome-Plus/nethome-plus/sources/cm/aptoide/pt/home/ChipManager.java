package cm.aptoide.pt.home;

import cm.aptoide.pt.DeepLinkIntentReceiver;

/* loaded from: classes.dex */
public class ChipManager {
    private Chip currentChip;

    /* loaded from: classes.dex */
    public enum Chip {
        APPS(DeepLinkIntentReceiver.DeepLinksTargets.APPS),
        GAMES("games");

        private String name;

        Chip(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public Chip getCurrentChip() {
        return this.currentChip;
    }

    public void setCurrentChip(Chip chip) {
        this.currentChip = chip;
    }
}
