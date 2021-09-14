<h1> stakater Excercise <h1>

<h3>Objective</h3>
    To implement application to consume serivice from backend and run application using docker and kubernete. 
    Read property value from helm file.
    
<h3> Pre-requisite</h3>
  <ul>
  <li>Java 8</li>
    <li>Maven</li>
    <li>Docker</li>
    <li>Minikube</li>
    <li>Kubectl</li>
    <li>Helm</li>
    <li>Node</li>
    <li>NPM</li>
    <li>Angular</li>
  </ul>
  
  <h3>To Run the Backend application application</h3>
      <ul>
        <li>To build docker image <br>
          <code>docker build -t srisathiya01/stakaterbackend .</code>
        </li>
        <li>Push the docker image to docker hub <br>
          <code>docker push srisathiya01/stakaterbackend</code>
        </li>
        <li>Pull the image from docker hub and run using kubernete
          <br>
          <code>helm install stakaterbackend stakaterbackend </code>
        </li>
        <li>To forward port and use in local machine
          <br>
          <code>kubectl port-forward svc/stakaterbackend 8080:8080 </code>          
        </li>
        <li>To test the application kindly check the url
          <br>
          <code>http://localhost:8080/greeting </code>
          Note: if you got the "Hello SATHIYARAJ" then setup running without error.
          value "SATHIYARAJ" is fetched from deployment.yaml file.
        </li>
  </ul>
  
  <h3>To Run the Frontend application application</h3>
      <ul>
        <li>To build docker image <br>
          <code>docker build -t srisathiya01/stakaterfrontend .</code>
        </li>
        <li>Push the docker image to docker hub <br>
          <code>docker push srisathiya01/stakaterfrontend</code>
        </li>
        <li>Pull the image from docker hub and run using kubernete
          <br>
          <code>helm install stakaterfrontend stakaterfrontend </code>
        </li>
        <li>To forward port and use in local machine
          <br>
          <code>kubectl port-forward svc/stakaterfrontend 4200:4200 </code>          
        </li>
        <li>To test the application kindly check the url
          <br>
          <code>http://localhost:4200 </code>
          Note: if you got the "Hello SATHIYARAJ" then setup running without error.          
        </li>
  </ul>
  
