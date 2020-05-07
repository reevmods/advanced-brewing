echo "Downloading Forge 1.12.2 From Server SLPNetwork CDN"
wget "https://cdn.slpnetwork.de/dl/forge.zip" -outfile "forge.zip"
echo "Extractiing from forge zip file"
Expand-Archive forge.zip -DestinationPath ./
echo "Setting up Workspace"
./gradlew SetupDecompWorkspace
echo "Setting up Eclipse"
./gradlew eclipse
echo "Well i am done have fun modding"
pause