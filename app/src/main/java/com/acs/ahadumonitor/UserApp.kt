package com.acs.ahadumonitor

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApp @Inject constructor(
): Application()