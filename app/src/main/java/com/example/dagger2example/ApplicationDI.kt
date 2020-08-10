package com.example.dagger2example

import dagger.Component
import dagger.Module
import dagger.Provides


@Component(modules = [ApplicationModule::class])
interface ApplicationComponent{
    fun inject(mainActivity: MainActivity)
}

@Module
class ApplicationModule {
    @Provides
    fun getDoorClass() = Door()

    @Provides
    fun getGlassClass() = Glass()

    @Provides
    fun getPeopleClass() = People()

    @Provides
    fun getWindowClass(glass: Glass) = Window(glass)

    @Provides
    fun getHouseClass(door: Door, people: People, window: Window) = House(door, window, people)
}