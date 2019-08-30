<template>
    <major class="main_major">
        <div id="d-major" style="height:70px">
            <div id="test" class="cricle" @click="change">
                <div class="left-config" id="left" style="display:none">
                    <i id="d-major-playPause"  class="play icon-play" @click="start" > </i>
                    <i id="d-major-next" class="next icon-next" @click="next"></i>
                </div>
                <div class="right-info" id="right" @click="cg_ce" style="display:none"  >
                    <h3 id="d-audio-audioTitle" class="m-title"></h3>
                    <p id="d-audio-audioSinger" class="m-singer"></p>
                </div>
            </div>
        </div>
        
    </major>
</template>
<script>
import axios from 'axios'
export default {
    data () {
        return {
            isContent:false,
            getdata:[]
        }
    },
    created() {
        this.document.getElementById('left').style.display = 'none';
    },
    methods: {
        change:function(e) {
            // console.log(e)
            // e就是点击后获取的东西
            let pause = document.getElementById('d-major-playPause');
            let next = document.getElementById('d-major-next');

            if (document.getElementById('test').className == 'cricle'){
                document.getElementById('test').className = 'content';
                document.getElementById('left').style.display = 'block';
                document.getElementById('right').style.display = 'block';
            }else if (e.target != pause && e.target != next) {
                document.getElementById('test').className = 'cricle';
                document.getElementById('left').style.display = 'none';
                document.getElementById('right').style.display = 'none';
            }
        },
         start(){
            if(document.getElementById('d-major-playPause').className == 'play icon-play'){
                document.getElementById('d-major-playPause').className = 'play icon-pause'
                axios.get('http://www.daiwei.org/vue/server/music.php?inAjax=1&do=playlist&id=2179377798').then((res)=>{
                console.log('res',res.data.data)
                let music = res.data.playlist.tracks
                console.log('music',music)
                /*
                Math.floor(Math.random() * music.length)
                Math.random() * music.length --> 产生[0,music.length)的数
                Math.floor()则会取整 把取得的赋给index
                */
                let index = Math.floor(Math.random() * music.length)
                console.log('index',index)
                axios.get('http://www.daiwei.org/vue/server/music.php?inAjax=1&do=musicInfo&id='+ music[index].id).then((res)=>{
                    console.log('id',music[index].id)
                    const d = {
                        src: res.data.data[0].url,
                        imageurl: music[index].al.picUrl + '?param=300y300',
                        name: music[index].name,
                        singer: music[index].ar[0].name
                    }
                    // return that.getdata = d
                    // console.log('data',that.getdata)
                    console.log('src',d.src)
                    console.log('img', d.imageurl)
                    console.log('name', d.name)
                    console.log('singer', d.singer)
                    document.getElementById('test').style.cssText = `background-image: url("${d.imageurl}");background-size: cover;background-position: center;`
                    let h3 = document.getElementById('d-audio-audioTitle')
                    h3.innerHTML = `${d.name}`
                    let p = document.getElementById('d-audio-audioSinger')
                    p.innerHTML = `${d.singer}`
                    let Audio = document.createElement('audio')
                    Audio.setAttribute('src',d.src)
                    document.getElementById('test').appendChild(Audio)
                    Audio.play();
                })
            },(err)=>{
                console.log(err)
            })
            }else{
                document.getElementById('d-major-playPause').className = 'play icon-play'
                let Audio = document.createElement('audio')
                Audio.setAttribute('src',d.src)
                document.getElementById('test').appendChild(Audio)
                Audio.pause()
            }
        },
        next:function (){
            index = Math.floor(Math.random() * music.length)
            axios.get('http://www.daiwei.org/vue/server/music.php?inAjax=1&do=musicInfo&id=' + music[index].id).then((res) => {
                const info = {
                    src: res.data.data[0].url,
                    imageurl: music[index].al.picUrl + '?param=300y300',
                    name: music[index].name,
                    singer: music[index].ar[0].name
                }
                d.checkAudio(info.src, info.imageurl, info.name, info.singer)
            },(err)=>{
                console.log(err)
            })
        }
    }
}
</script>
<style lang="stylus" scoped>
*{
    margin 0
    padding 0
}
@-webkit-keyframes rotation{

from {-webkit-transform: rotate(0deg);}

to {-webkit-transform: rotate(360deg);}

}

.cricle{
    margin:0 auto
    width 55px
    height 55px
    border: 3px solid rgba(14, 90, 80, 0.397);
    background-image: url("../assets/smil.jpg")
    background-repeat:no-repeat;
    background-size:100% 100%;
    -moz-background-size:100% 100%;
    -webkit-border-radius: 50%;
    -moz-border-radius: 50%;
    -ms-border-radius: 50%;
    -o-border-radius: 50%;
    border-radius: 50%;
    position absolute
    top 292px
    left 648px
    -webkit-transform: rotate(360deg);

    animation: rotation 3s linear infinite;

    -moz-animation: rotation 3s linear infinite;

    -webkit-animation: rotation 3s linear infinite;

    -o-animation: rotation 3s linear infinite;
    
    transition: all 2s;
    /*transition: height 1s;*/
}
    
.content
    margin:0 auto
    width: 240px;
    height: 55px;
    overflow: hidden;
    border-radius: 6px;
    font-family: 'PingFangSC-Regular', Arial, Helvetica, sans-serif;
    z-index: 5
    align-items: center;
    justify-content: center;
    visibility: visible;
    opacity: 1;
    position absolute
    top 292px
    left 563px
    transition: all 2s;
    .left-config
      float left
      display flex
      margin 0
      width 90px
      padding-left 5px
      padding-right 10px
      height: 100%;
      align-items: center;
      overflow: hidden;
      box-sizing: border-box;
      i{
          display block
          width 36px
          height 36px
          background rgba(0,0,0,0.5)
          border-radius 50%
          color rgba(255,255,255,0.8)
          text-align center
          line-height 36px
          font-size 22px
          cursor pointer
          z-index 100
          &.next{
              width 28px
              height 28px
              margin-left 10px
              line-height 28px
              font-size 10px
          }
          &:hover{
              background :rgba(0,0,0,1)
          }
      }
      #d-major-playPause{
          position absolute
          top 8.5px
      }
      .pause{
          position relative;
          top 10px
          left 5px
      }
      .next{
          position absolute
          left 40px
          top 15px
      }
    .right-info
        // float left  
        overflow:hidden
        width 135px
        height: 100%;
        padding-left 10px
        padding-right 5px
        visibility: visible;
        opacity: 1;
        display: flex;
        align-items: center
        justify-content: center
        flex-direction: column
        .m-title{
            font-size 16px
            padding 1px 0
            font-weight 200
            text-overflow ellipsis
            overflow hidden
            white-space nowrap
            width 100%
            text-align center
            position relative
            top 9px
        }
        .m-singer{
            font-weight: 200;
            padding: 1px 0;
            font-size: 12px;
            margin: 0;
            color: black ;
            text-overflow: ellipsis;
            overflow: hidden;
            white-space: nowrap;
            width: 100%;
            text-align: center;
            position relative
            top 8px
        }
</style>
