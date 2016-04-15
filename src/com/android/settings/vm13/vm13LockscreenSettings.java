package com.android.settings.vm13;

import android.os.Bundle;

import com.android.settings.InstrumentedFragment;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

import com.android.internal.logging.MetricsLogger;

public class vm13LockscreenSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.vm13_lockscreen_settings);
    }
    
    @Override
    protected int getMetricsCategory() {
        return InstrumentedFragment.vm13LockscreenSettings;
    }
 }
